package org.example.data20260216;

//统计 1~n 中能被 3 或 5 整除的数

import java.util.ArrayList;
import java.util.Scanner;

public class CountDivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                arrayList.add(i);
        }
        for (int arr : arrayList)
            System.out.println(arr);
    }
}
