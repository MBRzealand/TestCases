package Prog_Kap2;

import java.util.Scanner;

class Opgave2_3 {

    static String metersToFeet() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter meters: ");
        double meters = input.nextDouble();
        double feet = meters * 3.2786;

        String output = (meters + " meter equals: " + feet + " feet");

        return output;

    }


    public static void main(String[] args) {

        System.out.println(metersToFeet());

    }


}
