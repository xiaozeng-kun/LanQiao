package org.example.data20260218;

//13.二维数组每列最小值

public class Arrays2DMin {
    public static void main(String[] args) {
        int[][] arr = {{0,45,3,18,6},{78,21,11,68,12},{63,45,78,29,1}};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
            System.out.println("第"+i+"行中的最小值是："+min);
        }
    }
}
