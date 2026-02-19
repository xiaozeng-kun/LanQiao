package org.example.data20260215;

//输入 n，输出 n 行星星

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("*");
        }
        sc.close();
    }
}
