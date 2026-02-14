package org.example.data20260214;

import java.util.*;

/*
* 在对银行账户等重要权限设置密码的时候，我们常常遇到这样的烦恼：如果为了好记用生日吧，容易被破解，不安全；
* 如果设置不好记的密码，又担心自己也会忘记；如果写在纸上，担心纸张被别人发现或弄丢了。
这个程序的任务就是把一串拼音字母转换为 6 位数字（密码）。
我们可以使用任何好记的拼音串(比如名字，王喜明，就写：wangximing )作为输入，程序输出 6 位数字。
变换的过程如下：
第一步. 把字符串 6 个一组折叠起来，比如 wangximing 则变为：
wangxi
ming
第二步. 把所有垂直在同一个位置的字符的 ascii 码值相加，得出 6 个数字，如上面的例子，则得出：228 202 220 206 120 105
第三步.再把每个数字"缩位"处理：就是把每个位的数字相加，得出的数字如果不是一位数字，就再缩位，直到变成一位数字为止。
例如: 228 => 2+2+8=12 => 1+2=3
上面的数字缩位后变为：344836, 这就是程序最终的输出结果！
要求程序从标准输入接收数据，在标准输出上输出结果。
输入描述
第一行是一个整数
n(n<100），表示下边有多少输入行，接下来是 n 行字符串，就是等待变换的字符串。
输出描述
n 行变换后的 6 位密码。
*
*
*
* */

public class 密码发生器_2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int Line = 0; Line < n; Line++) {
            int[] values= new int[6];
            String password = sc.next();
            for (int i = 0; i < password.length(); i+=6) {
                int endIndex = Math.min(i+6,password.length());
                String cache = password.substring(i,endIndex);
                for (int j = 0; j < cache.length(); j++)
                    values[j] += Integer.valueOf(cache.charAt(j));
            }
            for (int k = 0; k < values.length; k++) {
                int num =0;
                int length =String.valueOf(values[k]).length();
                while(length != 1){
                    int[] arr = new int[length];
                    String str = String.valueOf(values[k]);
                    for (int L = 0; L < arr.length; L++) {
                        arr[L] = str.charAt(L)-'0';
                        num += arr[L];
                    }
                    values[k] = num;
                    num = 0;
                    length = String.valueOf(values[k]).length();
                }
            }
            for(int arr : values){
                System.out.print(arr+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}