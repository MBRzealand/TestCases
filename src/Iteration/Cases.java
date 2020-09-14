package Iteration;

import jdk.swing.interop.SwingInterOpUtils;
import java.lang.Math;


class Iteration_7 {

    static void iteration7(int minimum, int maximum) {

        int lige = 0;
        int ulige = 0;

        for (int i = minimum; i <= maximum; i++) {

            if ((i % 2) == 0) {
                lige += 1;

            } else {

                ulige += 1;

            }

        }

        System.out.println("Der er " + ulige + " ulige og " + lige + " lige tal i intervallet " + "[" + minimum + ";" + maximum + "]");

    }

    public static void main(String[] args) {

        iteration7(2, 8);


    }

}

