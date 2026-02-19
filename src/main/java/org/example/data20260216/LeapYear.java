package org.example.data20260216;

//输入年份判断闰年

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year+"是闰年");
        else
            System.out.println(year+"不是闰年");
    }
}
