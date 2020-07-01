package com.sorted.puzirek.les2;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 1000);
            list.add(x);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) { // меняя знак меньше на больше меняем порядок сортировки.
                    int a = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, a);
                }
                System.out.println(list);
            }
        }


        /* способ от хауди хо
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int a = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, a);
                }
            }
        }
        */

    }

}
