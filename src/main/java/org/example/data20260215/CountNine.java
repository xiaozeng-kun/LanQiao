package org.example.data20260215;

//11.统计 1~1000 中包含 9 的数

import java.util.ArrayList;

public class CountNine {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= 1000; i++) {
            int n = i;
            while(n > 0){
                int last = n % 10;
                if (last == 9){
                    arrayList.add(index,i);
                    index++;
                    break;
                }
                n = n / 10;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
            if((i+1) % 10 == 0)
                System.out.println();
        }
    }
}
