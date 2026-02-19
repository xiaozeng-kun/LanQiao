package org.example.data20260218;

//17.合并两个数组

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];
        }
        for(int a : arr)
            System.out.print(a+" ");
    }
}
