package org.example.data20260216;

//输入三个数求最大值和最小值

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("最大值是："+max+",最小值是："+min);
    }
}
