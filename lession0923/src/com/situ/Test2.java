package com.situ;

public class Test2 {

    public static void main(String[] args) {
        double s = 99.5;
        // 90以上 A+
        // 80 ~90 A
        // 70 ~80 B
        // 60 ~ 70 C
        // 60以下D

        // 并列的if...else...结构
        /*if (s >= 90) {
            System.out.println("A+");
        } else if (s >= 80 && s < 90) {
            System.out.println("A");
        } else if (s >= 70 && s < 80) {
            System.out.println("B");
        } else if (s >= 60 && s < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        */

        // 嵌套的if...else...结构
        if (s >= 90) {
            System.out.println("A+");
        } else {// <90
            if (s >= 80) {
                System.out.println("A");
            } else {// <80
                if (s >= 70) {
                    System.out.println("B");
                } else {// <70
                    if (s >= 60) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                }
            }
        }

        if (s > 80) {
            if (s > 90) {

            } else {

            }
        } else {
            if (s > 70) {

            } else {

            }
        }

    }

}
