package org.example.data20260213;


/*
* 古罗马帝国开创了辉煌的人类文明，但他们的数字表示法的确有些繁琐，尤其在表示大数的时候，现在看起来简直不能忍受，所以在现代很少使用了。
* 之所以这样，不是因为发明表示法的人的智力的问题，而是因为一个宗教的原因，当时的宗教禁止在数字中出现 0 的概念！罗马数字的表示主要依赖以下几个基本符号：
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
这里，我们只介绍一下 1000 以内的数字的表示法。
单个符号重复多少次，就表示多少倍。最多重复 3 次。比如：CCC 表示 300，XX 表示 20，但 150 并不用 LLL 表示，这个规则仅适用于 I X C M。
如果相邻级别的大单位在右，小单位在左，表示大单位中扣除小单位。比如：IX 表示 9，IV 表示 4， XL 表示 40
*
* 本题目的要求是：请编写程序，由用户输入若干个罗马数字串，程序输出对应的十进制表示。
    输入描述：第一行是整数 n (n<100) ,表示接下来有n个罗马数字。以后每行一个罗马数字。罗马数字大小不超过 999。
    输出描述：要求程序输出n行，就是罗马数字对应的十进制数据。
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 罗马数字_2012 {
    private static final Map<Character, Integer> map = new HashMap<>();
    static{
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //要输入多少行
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String str = sc.nextLine().trim();
            char[] chars = str.toCharArray();
            int prev = map.get(chars[chars.length - 1]);
            for (int j = chars.length-1; j >= 0; j--) {
                int cur = map.get(chars[j]);
                if (prev > cur)
                    sum -= cur;
                else
                    sum += cur;
                prev = cur;
            }
            System.out.println(sum);
        }
    }
}
