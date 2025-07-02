package AdvJav.adv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fiile {
    public static void main(String[] args) {

        /*
        //create a file
        File myfile = new File("new_file.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Code to write a File:
        try {
            FileWriter fileWriter = new FileWriter("new_file.txt");
            fileWriter.write("1st File in Java \n ok now Bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        File myfile = new File("this.txt");
        try {
            Scanner sc =new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }

//        //for deleting the file
//        File myfile = new File("this.txt");
//        if(myfile.delete()){
//            System.out.println("Deleted" + myfile.getName());
//        }
//        else {
//            System.out.println("Problem Occured");
//        }


    }
}
