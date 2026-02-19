package org.example.data20260216;

//计算斐波那契数列第 n 项（简单循环版）

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+ arr[i-2];
        }

        for (int a : arr)
            System.out.print(a+" ");
    }
}
