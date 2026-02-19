package org.example.data20260216;

//18.求两个数的最大公约数（循环枚举）

import java.util.Scanner;

public class MaxCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //取其中的最小数，因为最大公约数不会超过其中的最小数
        int min = Math.min(a,b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0){
                System.out.println(a+"和"+b+"的最大公约数是："+i);
                break;
            }
        }
    }
}
