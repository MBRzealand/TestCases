package Iteration;

class iteration_5 {

    static void iteration5(int x, int y) {

        for (int i = x; i <= y; i++) {

            if ((i % 2) == 0) {

                System.out.println(i + " er lige");

            } else {

                System.out.println(i + " er ulige");
            }


        }


    }

    public static void main(String[] args) {

        iteration5(0, 10);
        iteration5(-10, 7);

    }

}
