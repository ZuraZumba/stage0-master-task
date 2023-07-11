package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = first^second;
        second = first^second;
        first = first^second;
        System.out.println(first);
        System.out.println(second);
    }
    public static void main(String[] args){
        int first = 3;
        int second = 4;
        new BitwiseValuesSwap().swap(first, second);
    }

}
