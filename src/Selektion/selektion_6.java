package Selektion;

class selektion_6 {

    static void selektion6(int x, int y, int z) {

        if ((x < y && y < z) || (x > y && y > z)) {

            System.out.println(y);

        } else if ((y < x && x < z) || (y > x && x > z)) {

            System.out.println(x);

        } else if ((x < z && z < y) || (x > z && z > y)) {

            System.out.println(z);

        } else {

            System.out.println("multiple numbers are equal so no middle number");

        }

    }

    public static void main(String[] args) {

        selektion6(1, 2, 3);
        selektion6(2, 6, 5);
        selektion6(0, 0, 0);
    }

}
