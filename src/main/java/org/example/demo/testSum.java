package org.example.demo;


//小明对数位中含有2、0、1、9的数字很感兴趣，
// 在1到40中这样的数包括1、2、9、10至32、39和40,共28个，他们的和是574。
// 请问，在1到2019中，所有这样的数的和是多少?

public class testSum {
    public static void main(String[] args) {
        Integer sum = 0;
        for (int i = 1; i < 2020; i++) {
            String s = String.valueOf(i);
            int[] arr = new int[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j) - '0';
            }
            for (int j = 0; j < s.length(); j++) {
                if (arr[j] == 2  || arr[j] == 0|| arr[j] == 1 || arr[j] == 9){
                    sum += Integer.parseInt(s);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
