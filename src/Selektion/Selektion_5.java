package Selektion;

class Selektion_5 {

    static void selektion5(int x) {

        if (x >= 0) {

            for (int i = 0; i <= x; i += 10) {

                if ((i <= x) && (x < (i + 10))) {

                    System.out.println("[" + i + ";" + (i + 9) + "]");
                }

            }

        } else if (x < 0) {

            for (int i = 0; i >= x; i -= 10) {

                if ((i >= x) && (x > (i - 10))) {

                    System.out.println("[" + (i - 10) + ";" + (i - 1) + "]");
                }

            }

        }

    }

    public static void main(String[] args) {
        selektion5(7);
    }

}
