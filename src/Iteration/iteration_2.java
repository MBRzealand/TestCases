package Iteration;

class iteration_2 {

    static void iteration2(int x, int y) {

        for (int i = x; i <= y; i++) {

            if (i % 2 != 0) {

                System.out.println(i);

            } else {

                continue;

            }

        }

    }

    public static void main(String[] args) {

        iteration2(10, 21);
        iteration2(33, 75);

    }

}
