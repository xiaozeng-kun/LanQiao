package org.example.data20260218;

//15.统计数组中正数 / 负数个数

public class CountPositiveAndNegativeNumber {
    public static void main(String[] args) {
        //正数个数
        int positive = 0;
        //负数个数
        int negative = 0;
        int[] arr = {45,12,-45,98,-66,78,11,68,-10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positive++;
            else if(arr[i] < 0)
                negative++;
        }
        System.out.println("正数个数是："+positive);
        System.out.println("负数个数是："+negative);
    }
}
