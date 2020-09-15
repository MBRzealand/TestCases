package Prog_Kap2;

import java.util.Scanner;

class Opgave2_4 {

    static String sqMetersToPing() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter square meters: ");
        double sqMeters = input.nextDouble();
        double ping = sqMeters * 0.3025;
        input.close();

        String output = (sqMeters + " square meters equals: " + ping + " ping");

        return output;


    }


    public static void main(String[] args) {

        System.out.println(sqMetersToPing());

    }


}


