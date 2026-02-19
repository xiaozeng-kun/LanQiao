package org.example.data20260217;

//查找数组中第一个大于 x 的数

import java.util.Scanner;

public class ArraysFirstBigXNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = {12,35,78,10,49,5};
        int bigX = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x){
                bigX = arr[i];
                System.out.println("第一个大于"+x+"的数是："+bigX);
                break;
            }
        }
        System.out.println("没有大于"+x+"的数");

    }
}
