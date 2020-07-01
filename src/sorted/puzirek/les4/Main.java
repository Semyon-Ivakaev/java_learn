package sorted.puzirek.les4;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            int x = (int) (Math.random() * 1000);
            list[i] = x;
        }

        for (int i: list) {
            System.out.print(i + " ");
        }

        System.out.println();

        boolean cancel = false;
        while (!cancel) {
            cancel = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int a = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = a;
                    cancel = false;
                }
            }
        }

        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
