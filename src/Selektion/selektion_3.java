package Selektion;

class selektion_3 {

    static void selektion3(int first, int second) {

        if (first > second) {

            System.out.println(first);

        } else if (first < second) {

            System.out.println(second);

        } else {
            System.out.println("both are " + first);
        }

    }

    public static void main(String[] args) {

        selektion3(7, 2);
        selektion3(2, 2);
        selektion3(3, 9);

    }

}
