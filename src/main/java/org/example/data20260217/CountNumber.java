package org.example.data20260217;

//6.查找数组中某个数出现的次数

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        int[] arr = {5,6,79,12,5,38,66,5,6};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //输入要查找的数
        int correct = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == correct)
                count++;
        }
        System.out.println(correct+"出现的次数是："+count);
    }
}
