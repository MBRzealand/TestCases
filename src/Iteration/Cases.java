package Iteration;


import java.util.Arrays;
import java.util.Scanner;



class Iteration_7 {

    static int[] iteration7(int minimum, int maximum) {
        int[] data = {1,2};
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


        System.out.println("Der er " + iteration7(minimum,maximum)[1] + " ulige og " + iteration7(minimum,maximum)[0] + " lige tal i intervallet " + "[" + minimum + ";" + maximum + "]");
    }

}



class test {



        public static void main(String[] args) {

            // Creates an object of Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");

            // Takes input from the keyboard
            String name = input.nextLine();

            // Prints name
            System.out.println("My name is " + name);

            // Closes the scanner
            input.close();
        }

}

