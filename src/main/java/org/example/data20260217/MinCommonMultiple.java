package org.example.data20260217;

//求两个数的最小公倍数

import java.util.Scanner;

public class MinCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //先求最大公约数，用最大公约数求最小公倍数，公式为（a * b）/ 2
        int num = Math.min(a,b);
        int maxNum = 0;
        for (int i = num; i > 0; i--) {
            if (a % i == 0 && b % i == 0)
                maxNum = i;
        }
        int minNum = (a * b) / 2;
        System.out.println(a+"和"+b+"的最小公倍数是："+minNum);
    }
}
