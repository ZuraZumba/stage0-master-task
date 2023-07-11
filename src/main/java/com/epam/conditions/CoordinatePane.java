package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x != 0 && y != 0){
            if (x > 0){
                String positiveX = (y > 0) ? "first" : "fourth";
                System.out.println(positiveX);
            }
            else {
                String negativeX = (y > 0) ? "second" : "third";
                System.out.println(negativeX);
            }
        }
        else {
            System.out.println("zero");
        }

    }
    public static void main (String[] args){
        int x = 1;
        int y = -1;
        new CoordinatePane().printQuadrant(x,y);
    }
}

