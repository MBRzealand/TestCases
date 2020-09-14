package Iteration;

class iteration_3 {

    static void iteration3(int x) {

        for (int i = 1; i <= x; i++) {

            if (i % 8 == 0) {

                System.out.println(i);

            } else {

                continue;

            }

        }

    }

    public static void main(String[] args) {

        iteration3(37);
        iteration3(17);
        iteration3(0);
        iteration3(1);
    }

}
