package org.example.data20260215;

//5.求 n 的阶乘

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int acc = 1;
        for (int i = 1; i <= n; i++) {
            acc *= i;
        }
        System.out.println(acc);
        sc.close();
    }
}
