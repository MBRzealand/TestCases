package Selektion;

class selektion_7 {

    static void selektion7(int x, int y) {

        if (x > y) {

            if ((x - y) > 10) {

                System.out.println("difference between x and y is greater than 10");

            } else if ((x - y) <= 10) {

                System.out.println("difference between x and y is smaller than or equal to 10");

            }

        } else if (x < y) {

            if ((y - x) > 10) {

                System.out.println("difference between x and y is greater than 10");

            } else if ((y - x) <= 10) {

                System.out.println("difference between x and y is smaller than or equal to 10");

            }

        } else {

            System.out.println("difference between x and y is 0");

        }

    }

    public static void main(String[] args) {

        selektion7(10, 10);
        selektion7(-15, 19);
        selektion7(0, 10);
    }

}
