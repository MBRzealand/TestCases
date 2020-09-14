package Selektion;

class selektion_4 {
    static void selektion4(int first, int second, int third) {

        if ((first > second) && (first > third)) {

            System.out.println(first);

        } else if ((second > first) && (second > third)) {

            System.out.println(second);

        } else if ((third > first) && (third > second)) {

            System.out.println(third);

        }

    }

    public static void main(String[] args) {

        selektion4(7, 3, 5);

    }

}
