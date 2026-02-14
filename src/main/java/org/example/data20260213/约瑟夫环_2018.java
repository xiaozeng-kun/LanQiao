package org.example.data20260213;

//n个人的编号是 1 ~n，如果他们依编号按顺时针排成一个圆圈，从编号是 1 的人开始顺时针报数。
//（报数是从 1 报起）当报到 k 的时候，这个人就退出游戏圈。下一个人重新从 1 开始报数。
//求最后剩下的人的编号。这就是著名的约瑟夫环问题。本题目就是已知 n，k 的情况下，求最后剩下的人的编号。

import java.util.Scanner;

/**
 *输入是一行，2 个空格分开的整数 n,k (0<n,k<10的7次方)。
 *输入：10 3
 *输出 4
 * */
public class 约瑟夫环_2018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int k = scan.nextInt();
        //只剩1个人时，编号为0
        int res = 0;
        for (int i = 2; i <= n; i++) {
            // k%i优化k的值大于n的计算
            res = (res + k % i) % i;
        }
        System.out.println(res + 1);
        scan.close();
    }
}
