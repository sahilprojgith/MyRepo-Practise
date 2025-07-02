package com.company;

public class Arrays2 {
    public static void main(String[] args) {

        //Add two matrices of size 2 x 3

        int [][] mat1=  {{2, 4, 6},
                        {6, 7, 8}};
        int [][] mat2=  {{4, 3, 9},
                        {1, 5, 7}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int j = 0; j < mat1[0].length; j++) {
            System.out.format("Setting the values for i=%d and j=%d\n", 0, j);
            result[0][j] = mat1[0][j] + mat2[0][j];
        }
        for (int j = 0; j < mat1[1].length; j++) {
            System.out.format("Setting the values for i=%d and j=%d\n", 1, j);
            result[1][j] = mat1[1][j] + mat2[1][j];
        }

        for(int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }
    }
}

/*
    //Calculate the average marks from an array containing marks of all students in Physics using for each loop

    float[] marks = {45.7f, 56.8f,78.9f,12.3f,34.6f};
    float sum = 0;

        for (float element:marks){
                sum = sum + element;
                }
                System.out.println("the value of average number is " + sum/marks.length);*/

/*

//Calculate an Array of 5 floats and calculate their sum

    float[] marks = {45.7f, 56.8f,78.9f,12.3f,34.6f};
    float sum = 0;

        for(float element:marks){
                sum = sum + element;
                }

                System.out.println("the value of sum is :" + sum);
                */

    /*
    // To find out wheather a given integer is present or not

    float[] marks = {45.7f, 56.8f,78.9f,12.3f,34.6f};
    float num = 45.7f;
    boolean isInArray = false ;  // boolean is used to check the validity

        for(float element:marks){
                if(num==element){
                isInArray =true;
                break;
                }
                }
                if (isInArray){
                System.out.println("The value is present in the Array");
                }
                else{
                System.out.println("The value is not present in the Array");
                } */
