package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int i=1;
        if(numberTableToPrint>=0){

            while (i < 11){
                int result = i*numberTableToPrint;
                System.out.println(i+" x "+numberTableToPrint+" = "+result);
                i++;
            }
        }
        else{
            System.out.println("wrong input!");
        }
    }
    public static void main (String[] args){
        int number = 1;
        new MultiplicationTable().printTable(number);
    }

}
