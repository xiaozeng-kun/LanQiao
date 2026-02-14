package org.example.data20260213;

//小明开了一家糖果店。他别出心裁：把水果糖包成 4 颗一包和 7 颗一包的两种。糖果不能拆包卖。
//小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
//你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是 17。大于 17 的任何数字都可以用 4 和 7 组合出来。
//本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。

import java.util.Scanner;

public class 买不到的数目_2013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println((num1 * num2) - (num1 + num2));
        scan.close();
    }
}
