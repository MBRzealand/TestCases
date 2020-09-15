package Iteration;

import java.util.Scanner;

class Iteration_7 {

    static int[] iteration7(int minimum, int maximum) {
        int[] data = {1, 2};
        int lige = 0;
        int ulige = 0;

        for (int i = minimum; i <= maximum; i++) {

            if ((i % 2) == 0) {
                lige += 1;

            } else {

                ulige += 1;

            }

        }
        data[0] = lige;
        data[1] = ulige;

        return data;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter minimum: ");

        int minimum = input.nextInt();

        System.out.print("enter maximum: ");

        int maximum = input.nextInt();


        System.out.println("Der er " + iteration7(minimum, maximum)[1] + " ulige og " + iteration7(minimum, maximum)[0] + " lige tal i intervallet " + "[" + minimum + ";" + maximum + "]");
    }

}
