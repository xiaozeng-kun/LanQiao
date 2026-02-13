package org.example.demo;

//一些数字的立方的末尾正好是该数字本身。比如:1,4,5,6,9,24,25...;请你计算一下，
//在10^4以内的数字中(指该数字，并非它立方后的数值)，符合这个特征的正整数一共有多少个。

public class demo1 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 10000; i++) {
            long l = (long)i * i * i;
            String s1 = String.valueOf(i);
            String s2 = String.valueOf(l);
            if (s2.endsWith(s1))
                count++;
        }
        System.out.println(count);


//        int count = 0;
//        for (int i = 1; i < 2; i++) {
//            long l = (long)i * i * i;
//            //转换成字符串
//            String s1 = i+"";
//            String s2 = l+"";
//            //获取i的长度
//            int countI = s1.length();
//            //获取l的长度
//            int countL = String.valueOf(l).length();
//            //转换为数组
//            int[] arrI = new int[countI];
//            int[] arrL = new int[countL];
//            for (int j = 0; j < arrI.length; j++) {
//                arrI[j] = s1.charAt(j) - '0';
//            }
//            for (int j = 0; j < arrL.length; j++) {
//                arrL[j] = s2.charAt(j) - '0';
//            }
//            int countA = countI;
//            while(countA != 0){
//                for (int j = countL-1; countA != 0; j--) {
//                    if (arrL[j] != arrI[countA-1]){
//                        countA = 0;
//                        break;
//                    }
//                    else if (arrL[j] == arrI[countA-1]){
//                        countA--;
//                        if(countA-1 == 0)
//                            count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
    }
}
