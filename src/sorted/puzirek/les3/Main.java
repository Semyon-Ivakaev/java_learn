package sorted.puzirek.les3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 1000);
            list.add(x);
        }

        System.out.println(list);

        boolean cancel = false;

        while (!cancel) {
            cancel = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) { // < || > для смены типа сортировки
                    int a = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, a);
                    cancel = false;
                }
            }
        }
        System.out.println(list);
    }
}
