package org.example.data20260218;

//8.数组去重（简单版）

import java.util.Arrays;

public class ArraysDeleteRepeat {
    public static void main(String[] args) {
        int[] arr = {54,12,3,87,12,48,12,86,45,48};
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        for (int a : newArr)
            System.out.print(a+" ");
    }
}
