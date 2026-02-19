package org.example.data20260218;

//12.二维数组每行最大值

public class Arrays2DMax {
    public static void main(String[] args) {
        int[][] arr = {{97,42,78,111,87},{10,4,3,6,7},{0,45,81,14,666}};
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println("第"+i+"行中的最大值是："+max);
        }
    }
}
