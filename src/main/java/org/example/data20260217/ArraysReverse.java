package org.example.data20260217;

//数组反转

public class ArraysReverse {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length-1-i];
//        }
//        arr = newArr;


        //双指针交换法
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int a : arr)
            System.out.print(a+" ");
    }
}
