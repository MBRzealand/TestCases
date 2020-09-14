package Iteration;

class iteration_6 {

    static void iteration6(int x, int y) {

        int num = 0;

        for (int i = x; i <= y; i++) {

            if ((i % 2) != 0) {

                num += i;

            } else {

                continue;

            }


        }

        System.out.println(num);

    }

    public static void main(String[] args) {

        iteration6(2, 7);  // 3 + 5 + 7 = 15
        iteration6(1, 20);

    }


}
