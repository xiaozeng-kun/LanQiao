package org.example.demo;

import java.util.Scanner;

public class dem02 {
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
