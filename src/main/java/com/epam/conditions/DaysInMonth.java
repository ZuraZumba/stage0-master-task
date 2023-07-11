package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 12){
            switch (month){
                case 1,3,5,7,8,10,12:
                    System.out.println("31");
                    break;
                case 4,6,9,11:
                    System.out.println("30");
                    break;
            }
            if (month == 2){
                switch (year%4){
                    case 0:
                        switch (year%100){
                            case 0:
                                switch (year%400){
                                    case 0:
                                        System.out.println("29");
                                        break;
                                    default:
                                        System.out.println("28");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("29");
                                break;
                        }
                        break;
                    default:
                        System.out.println("28");
                        break;

                }
            }
        }
        else{
            System.out.println("invalid date");
        }

    }
    public static void main (String[] args){
        int year = 2008;
        int month = 13;
        new DaysInMonth().printDays(year, month);
    }

}
