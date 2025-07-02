package Assingment;

import java.util.HashSet;
import java.util.Iterator;
// Define the Book class
class Book {
    int id;
    String title;
    String author;
    String publisher;
    int quantity;
    // Constructor
    public Book(int id, String title, String author, String publisher, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;}
    // Override toString method to display the Book details
    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Publisher: " + publisher + ", Quantity: " + quantity;}}


