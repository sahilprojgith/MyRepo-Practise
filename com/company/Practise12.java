package com.company;

/*
If
x = 2
y = 5
z = 0
then find values of the following expressions:
a. x == 2
b. x != 5
c. x != 5 && y >= 5
d. z != 0 || x == 2
e. !(y < 10)  // . If the value of y is greater than or equal to 10,
//then the entire expression evaluates to true; otherwise, it evaluates to false.
 */

public class Practise12 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 0;

        System.out.println(x==2);
        System.out.println(x != 5);
        System.out.println( x != 5 && y >= 5);
        System.out.println(z != 0 || x == 2);
        System.out.println(!(y < 10));

    }
}
