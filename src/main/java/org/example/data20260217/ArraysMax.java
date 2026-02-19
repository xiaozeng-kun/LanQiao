package org.example.data20260217;

//1.求数组最大值

import java.util.Scanner;

public class ArraysMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入数组大小
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("数组最大值是："+max);
    }
}
