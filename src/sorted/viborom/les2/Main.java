package sorted.viborom.les2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int minValue = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < minValue) {
                    minValue = list.get(j);
                    minIndex = j;
                }
            }
            int pass = list.get(i);
            list.set(i, minValue);
            list.set(minIndex, pass);
        }

        System.out.println(list);
    }
}
