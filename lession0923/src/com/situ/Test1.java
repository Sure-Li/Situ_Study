package com.situ;

public class Test1 {

    public static void main(String[] args) {
        int year = 3000;
        int month = 3;

        // 1 3 5 7 8 10 12 ---31
        // 4 6 9 11 ---30
        // 2 28/29
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30天");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else {
            System.out.println("31天");
        }

        /* if (month < 8 && month % 2 == 1 || month >= 8 && month % 2 == 0) {
        
        }*/

    }
}
