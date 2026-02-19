package org.example.data20260218;

//16.数组中第 k 大的数（简单排序后取）

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInTheKNumber {
    public static void main(String[] args) {
        int[] arr = {46,8,2,48,24,78,35,11,8,96};
        Scanner sc = new Scanner(System.in);
        //输入要查找的第k大的数
        int k = sc.nextInt();
        //复制一份并排序
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        System.out.println(sorted[sorted.length-k]);
    }
}
