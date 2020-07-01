package com.sorted.puzirek.les1;


public class Main {
    public static void main(String[] args) {
        int[] list = new int[5];

        for ( int i = 0; i < list.length; i++) {
            int x = (int) (Math.random() * 1000);
            list[i] = x;
        }

        for (int i: list) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int a = list[i];
                    list[i] = list[j];
                    list[j] = a;
                }
            }
        }

            // [9, 3, 11, 1]
        for (int i: list) {
            System.out.print(i + " ");
        }


            }

        }



