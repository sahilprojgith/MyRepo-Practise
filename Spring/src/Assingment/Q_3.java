package Assingment;

import java.util.HashSet;
import java.util.Iterator;

public class Q_3 {
    public static void main(String[] args) {
// Create Book objects
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        Book b4 = new Book(104, "Core Java", "Shah", "SPD", 6);
        Book b5 = new Book(105, "Java Complete Reference", "Schildt", "Tata Mcgraw", 10);
// a. Add the Book objects to a HashSet object
        HashSet<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);
// b. Use the Iterator to display the objects contained in the bookSet
        Iterator<Book> iterator = bookSet.iterator();
        System.out.println("Books in the set:");
        while (((Iterator<?>) iterator).hasNext()) {
            System.out.println(iterator.next());
        }}}

