package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class AbstractInPlaceMerge {

    int size = 10;

    int[] a = new int[size];
    int[] aux = new int[a.length];
    int half = a.length / 2;


    Random rand = new Random();

    public void buildArray() {

        for (int h = 0; h < size; h++) {
            int random = rand.nextInt(10);
            a[h] = random;
            System.out.println(a[h]);
            aux[h] = a[h];
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {


            for (int j = half; j < a.length; j++) {


                for (int k = 0; k < a.length; k++) {


                    if (i == half) {

                        if (j < a.length) {
                            if (aux[j] < aux[j + 1] || aux[j] == aux[j + 1]) {
                                a[k] = aux[j];
                            } else {
                                a[k] = aux[j + 1];
                            }
                        }

                    } else if (j == a.length) {
                        if (i + 1 < half) {

                            if (aux[i] < aux[i + 1] || aux[i] == aux[i + 1]) {
                                a[k] = aux[i];
                            } else {
                                a[k] = aux[j + 1];
                            }
                        } else {
                            a[k] = i;
                        }
                    } else if (aux[i] < aux[j] || aux[i] == aux[j]) {

                        System.out.println(i + " < " + j);
                        a[k] = aux[i];
                        k++;
                        i++;

                    } else if (aux[i] > aux[j]) {
                        System.out.println(i + " > " + j);
                        a[k] = aux[j];
                        k++;
                        j++;
                    }

                    System.out.println(Arrays.toString(a));


                }
                System.out.println(Arrays.toString(a));

            }
        }
    }
}
