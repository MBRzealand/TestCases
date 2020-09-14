package Selektion;

class selektion_8 {

    static void selektion8(int x) {

        String[] liste = new String[]{"etter", "toer", "treer", "firer", "femmer", "sekser"};

        if (x > 0 && x <= 6) {

            System.out.println("Det er en " + liste[x - 1]);

        } else {

            System.out.println("Forkert antal øjne");

        }

    }


    public static void main(String[] args) {

        selektion8(3);
        selektion8(7);
        selektion8(0);
        selektion8(1);

    }

}
