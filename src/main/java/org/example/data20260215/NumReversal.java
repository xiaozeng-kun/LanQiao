package org.example.data20260215;

//数字反转（如 123→321）

import java.util.Scanner;

public class NumReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        long reversed = 0;
        int x = n;
        while(n > 0){
            int last = n % 10;
            reversed = reversed * 10 +last;
            n = n / 10;
        }
        if (x < 0)
            reversed = -reversed;
        System.out.println((int)reversed);
        sc.close();
    }
}
