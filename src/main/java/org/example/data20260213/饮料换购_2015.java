package org.example.data20260213;

import java.util.Scanner;

//乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊 C 型饮料，凭 3 个瓶盖可以再换一瓶 C 型饮料，并且可以一直循环下去(但不允许暂借或赊账)。
//请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的 n 瓶饮料，最后他一共能喝到多少瓶饮料。
//输入一个整数 n(0<n<1000)，表示开始购买的饮料数量。
public class 饮料换购_2015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int count = n;
        for(int i = n; i >= 3; i-=3){
            count++;
            i++;
        }
        System.out.println(count);
        scan.close();
    }
}
