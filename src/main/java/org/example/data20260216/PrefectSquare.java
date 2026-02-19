package org.example.data20260216;

//13.求 1~n 内的完全平方数

import java.util.Scanner;

public class PrefectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            System.out.println(square+"是完全平方数");
        }
    }
}
