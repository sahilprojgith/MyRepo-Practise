package JDBC;
import java.sql.*;
import java.util.Stack;

public class DeeleteJdbc {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password  = "shadowball";
        String query = " DELETE FROM employees where id = 3; ";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Drivers loaded successfully");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established!");
            Statement stmt = con.createStatement(); // blank rahega , no args taken here
            int rowsAffected = stmt.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("DELETE SUCCESS" + rowsAffected + " rows affected");
            }else {
                System.out.println("DELETION FAILED");
            }



            stmt.close();
            con.close();
            System.out.println("Connection closed successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}


