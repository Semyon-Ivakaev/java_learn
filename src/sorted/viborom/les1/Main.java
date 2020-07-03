package sorted.viborom.les1;

public class Main {
    public static void main(String[] args) {
        int list[] = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }

        for (int i: list) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < list.length - 1; i++) {
            int minValue = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            int pass = list[i];
            list[i] = list[minIndex];
            list[minIndex] = pass;
        }

        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
