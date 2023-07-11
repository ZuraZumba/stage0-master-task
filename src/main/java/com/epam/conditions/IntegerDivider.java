package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if(divider !=0 ){
            int result = dividend/divider;
            if(divider * result == dividend){
                System.out.println("can be divided completely");
            }
            else{
                System.out.println("cannot be divided completely");
            }
        }
        else{
            System.out.println("division by zero");
        }
    }

    public static void main(String[] args){
        int dividend = 5;
        int divider = 3;

        new IntegerDivider().printCompletelyDivided(dividend, divider);
    }

}
