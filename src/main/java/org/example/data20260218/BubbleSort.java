package org.example.data20260218;

//将数组升序排列（冒泡排序）

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45,3,87,24,61,42,7,35,94,57};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a : arr)
            System.out.print(a+" ");
    }
}
