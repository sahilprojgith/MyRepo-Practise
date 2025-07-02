public class Flat {
    private int squareFeet;
    private int pricePerSquareFeet;
    private int floorNumber;
    private int numberOfRooms;

    public Flat(int squareFeet, int pricePerSquareFeet, int floorNumber, int numberOfRooms) {
        this.squareFeet = squareFeet;
        this.pricePerSquareFeet = pricePerSquareFeet;
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getPricePerSquareFeet() {
        return pricePerSquareFeet;
    }

    public void setPricePerSquareFeet(int pricePerSquareFeet) {
        this.pricePerSquareFeet = pricePerSquareFeet;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFlatPrice(){
        int price = squareFeet*pricePerSquareFeet;

        return price;
    }

    public void printAllValues(){

        System.out.println("Square Feet : " + squareFeet);
        System.out.println("Price per square Feet : " + pricePerSquareFeet);
        System.out.println("Floor Number : " + floorNumber);
        System.out.println("Number of Rooms : " + numberOfRooms);

    }

    public static void main(String[] args) {
        Flat flat = new Flat(1000,1232,5,2);
        //flat.getFlatPrice();

        System.out.println("Price of Flat is : " + flat.getFlatPrice());

    }



}
