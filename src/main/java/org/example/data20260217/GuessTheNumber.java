package org.example.data20260217;

//20.简单猜数字游戏模拟

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true){
            int n = sc.nextInt();
            count++;
            if(n == number){
                System.out.println("恭喜你猜对了！！！，数字是："+number+",你一共猜了"+count+"次。");
                break;
            }
            else if (n > number)
                System.out.println("数字大了，再猜猜看");
            else if (n < number) {
                System.out.println("数字小了，再猜猜看");
            }
        }
    }
}
