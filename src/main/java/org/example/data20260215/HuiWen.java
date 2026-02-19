package org.example.data20260215;

//判断一个数是不是回文数

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //先保留n以便于判断是不是相等的
        int num = n;
        int reversed = 0;
        while(n > 0){
            int last = n % 10;
            reversed = reversed * 10 + last;
            n = n / 10;
        }
        if (num == reversed)
            System.out.println(num+"是回文数");
        else
            System.out.println(num+"不是回文数");
    }
}
