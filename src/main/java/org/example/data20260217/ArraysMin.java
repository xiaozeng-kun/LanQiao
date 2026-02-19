package org.example.data20260217;

//求数组最小值

import java.util.Scanner;

public class ArraysMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入数组大小
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                int temp = min;
                min = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("数组最小值是："+min);
    }
}
