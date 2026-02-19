package org.example.data20260216;

//求 100~999 的水仙花数

public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
             int n = i;
             int sum = 0;
             while(n > 0){
                 int last = n % 10;
                 sum += last * last *last;
                 n = n / 10;
             }
             if (sum == i)
                 System.out.println(i+"是水仙花数");
        }
    }
}
