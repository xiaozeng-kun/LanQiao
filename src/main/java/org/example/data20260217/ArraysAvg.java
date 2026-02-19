package org.example.data20260217;

//求数组平均值

import java.util.Scanner;

public class ArraysAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入数组大小
        int n = sc.nextInt();
        int[] arr = new int[n];
        //循环输入数组元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        //求数组平均值
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的平均值是："+sum / arr.length);
    }
}
