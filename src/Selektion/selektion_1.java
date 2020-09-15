package Selektion;

class selektion_1 {

    static void selektion1(int x, int y, int z) {

        System.out.println("a:" + (x <= 5 && z != y));
        System.out.println("b:" + (x == 5 || x == y && z == 3));
        System.out.println("c:" + (x / y > z / x));
        System.out.println("d:" + (!(x != y - z) == false));
        System.out.println("e:" + (2 * x != x || x == 0));
        System.out.println("f:" + (!true || !false));

    }

    public static void main(String[] args) {
        selektion1(5, 8, 3);
        System.out.println();
        selektion1(-2, 1, 9);
    }

}
