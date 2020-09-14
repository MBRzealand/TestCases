package Selektion;

class selektion_2 {

    static void selektion2(int x, int y) {

        if ((x + y) > 100) {

            System.out.println("summen er større end 100");

        } else if ((x + y) < 100) {

            System.out.println("summen er ikke større end 0");

        } else {

            System.out.println("summen er lig 100");

        }


    }

    public static void main(String[] args) {

        selektion2(41, 67);
        selektion2(50, 50);

    }


}
