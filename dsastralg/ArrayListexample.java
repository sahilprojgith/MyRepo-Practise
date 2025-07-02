package dtastructndalgo.dsastralg;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(745);
//        list.add(45467);
//        list.add(7657);
//        list.add(77676);
//        list.add(757567);
//        list.add(78768);
//        list.add(7768);
//        list.add(778);
//        list.add(778);
//        list.add(745);
//        list.add(447);
//        list.add(897);
//        list.add(997);
//        list.add(745644);
//        list.add(5645647);
//        list.add(4557);
//        list.add(1117);
//        list.remove(3);
//
//        System.out.println(list.contains(778));
//        System.out.println(list.contains(778768));
//        System.out.println(list.set(0,99));
//        System.out.println(list);


        for(int i = 0 ; i < 10 ; i++){
            list.add(in.nextInt());
        }
        System.out.println(list);


    }
}
