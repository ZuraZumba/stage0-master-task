package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++){
            for (int j = cathetusLength-1; j < i; j--){

                System.out.print("*");
            }

//            for (int k = 0; k < i; k++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
