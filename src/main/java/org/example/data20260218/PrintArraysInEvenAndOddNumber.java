package org.example.data20260218;

//输出数组中偶数 / 奇数

public class PrintArraysInEvenAndOddNumber {
    public static void main(String[] args) {
        int[] arr = {54,87,6,7,82,454,64,12,4,88,61};

        //输出偶数
        System.out.println("偶数是：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
        //输出奇数
        System.out.println("奇数是：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                System.out.print(arr[i]+" ");
        }
    }
}
