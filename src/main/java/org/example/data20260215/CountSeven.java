package org.example.data20260215;

//8.统计 1~n 中 7 出现的次数

import java.util.Scanner;

public class CountSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (Integer.valueOf(str.charAt(j)-'0') == 7)
                    count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
