package com.situ;

public class Test4 {

    public static void main(String[] args) {
        // 计算： 200之内，所有尾数不是3的数字的和

        int sum = 0;
        int i = 1;
        while (i <= 200) {
            if (i % 10 != 3) {
                sum = sum + i;
            }
            i = i + 1;
        }

    }

}
