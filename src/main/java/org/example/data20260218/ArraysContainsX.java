package org.example.data20260218;

//18.查找数组中是否存在 x

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysContainsX {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,4,2,3,7,8,9};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list.contains(x));
    }
}
