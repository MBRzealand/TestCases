package Prog_Kap2;

import java.util.Scanner;

class Opgave2_5 {

    static String tips() {

        System.out.println("Input in the format: subtotal, gratuity%");
        Scanner input = new Scanner(System.in);
        String rawInput = input.nextLine();
        String[] inputSplit = rawInput.split(", ");

        String subtotal = inputSplit[0];
        double subtotalConv = Double.parseDouble(subtotal);

        String gratuity = inputSplit[1];

        double percent = Double.parseDouble(gratuity.replace("%", "")) / 100;
        double gratuityConv = percent * subtotalConv;

        input.close();

        String output = ("gratuity: " + gratuityConv + "$" + "\n" + "Total: " + (subtotalConv + gratuityConv) + "$");

        return output;

    }


    public static void main(String[] args) {

        System.out.println(tips());

    }


}
