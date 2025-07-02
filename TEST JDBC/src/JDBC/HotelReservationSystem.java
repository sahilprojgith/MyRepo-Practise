package JDBC;

import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {
    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static  final String password = "shadowball";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // created a database, ask command line client to show databases. describe reservations;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            while (true){
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a HOTEL : ");
                System.out.println("2. View Reservations. ");
                System.out.println("3. Get Room Number. ");
                System.out.println("4. Update Reservations.");
                System.out.println("5. Delete Reservations. ");
                System.out.println("6. Exit. ");
                System.out.println();
                System.out.println("Choose an option according to your preference: ");

                int choice = scanner.nextInt(); // option choice mein store kara jaa rha hai.

                switch (choice){
                    case 1:
                        reserveRoom(connection,scanner);
                        break;
                    case 2:
                        viewReservations(connection);
                        break;
                    case 3:
                        getRoomNumber(connection,scanner);
                        break;
                    case 4:
                        updateReservations(connection, scanner);
                        break;
                    case 5:
                        exit();
                        scanner.close();
                    default:
                        System.out.println("Invalid choice ,Please try again.");
                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    private static void reserveRoom(Connection connection,Scanner scanner){
        try{
            System.out.println("Enter Guest's name: ");
            String guestName =scanner.next();
            scanner.nextLine();
            System.out.println("Enter room number: ");
            int roomNumber = scanner.nextInt();
            System.out.println("Enter contact number : ");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservations(guest_name, room_number, contact_number) " +
                    "VALUES(' " + guestName + " ' ,  " + roomNumber + ", '" + contactNumber + "')";

            try (Statement statement = connection.createStatement()){ // Statement interface ka function hai executeUpdate
                int affectedRows =  statement.executeUpdate(sql); // String sql run karta hai

                if(affectedRows>0){
                    System.out.println("Reservation Succesful");
                }else {
                    System.out.println("Reservation Failed");
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void viewReservations(Connection connection) throws SQLException{
        String sql = "SELECT reservation_id, guest_name, room_number, contact_number, reservation_date FROM reservations; ";

        try(Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){ // to store the query.
            System.out.println("Current Reservations:");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
            System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

            while (resultSet.next()){
                int reservationId = resultSet.getInt("reservation_id"); //case sensitive jaise sql mein create kare hai waise hi daalne hai
                String guestName = resultSet.getString("guest_name");
                int roomNumber = resultSet.getInt("room_number");
                String contactNumber = resultSet.getString("contact_number");
                String reservationDate = resultSet.getTimestamp("reservation_date").toString();

                System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s   |\n",
                        reservationId, guestName, roomNumber, contactNumber, reservationDate);

            }
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

        }
    }

    public static void getRoomNumber(Connection connection, Scanner scanner){
        try{
            System.out.println("Enter reservation ID: ");
            int reservationID = scanner.nextInt();
            System.out.println("Enter Guest Name: ");
            String guestName = scanner.next();

            String sql =  "SELECT room_number FROM reservations " +
                    "WHERE reservation_id = " + reservationID +
                    " AND guest_name = '" + guestName + "'";

            try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {

                if(resultSet.next()){
                    int roomNumber = resultSet.getInt("room_number");
                    System.out.println("Room Number for Reservartion ID" + reservationID +
                            "and Guest " + guestName + " is " + roomNumber);
                }else {
                    System.out.println("Reservation not found for given ID  and Guest Name.");
                }
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void updateReservations(Connection connection,Scanner scanner){
        try{
            System.out.println("Enter reservation ID  to update : ");
            int reservationID = scanner.nextInt();
            scanner.nextLine();

            if(!reservationExists(connection,reservationID)){
                System.out.println("Reservation not found for the given ID");
                return;
            }

            System.out.print("Enter new guest name: ");
            String newGuestName = scanner.nextLine();
            System.out.print("Enter new room number: ");
            int newRoomNumber = scanner.nextInt();
            System.out.print("Enter new contact number: ");
            String newContactNumber = scanner.next();

            String sql = "UPDATE reservations SET guest_name = '" + newGuestName + "', " +
                    "room_number = " + newRoomNumber + ", " +
                    "contact_number = '" + newContactNumber + "' " +
                    "WHERE reservation_id = " + reservationID;

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);

                if (affectedRows > 0) {
                    System.out.println("Reservation updated successfully!");
                } else {
                    System.out.println("Reservation update failed.");
                }
            }

        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    private static void deleteReservation(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter reservation ID to delete: ");
            int reservationId = scanner.nextInt();

            if (!reservationExists(connection, reservationId)) {
                System.out.println("Reservation not found for the given ID.");
                return;
            }

            String sql = "DELETE FROM reservations WHERE reservation_id = " + reservationId;

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);

                if (affectedRows > 0) {
                    System.out.println("Reservation deleted successfully!");
                } else {
                    System.out.println("Reservation deletion failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean reservationExists(Connection connection, int reservationId) {
        try {
            String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                return resultSet.next(); // If there's a result, the reservation exists
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Handle database errors as needed
        }
    }

    public static void exit() throws InterruptedException {
        System.out.print("Exiting System");
        int i = 5;
        while(i!=0){
            System.out.print(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("ThankYou For Using Hotel Reservation System!!!");
    }




}
