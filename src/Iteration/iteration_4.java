package Iteration;

class iteration_4 {

    static void iteration4(int n) {

        if (n == 0) {

            System.out.println(1);

        } else if (n < 0) {

            System.out.println("not defined for negative n");

        } else {

            int num = 1;

            for (int i = 1; i < n; i++) {

                num *= i + 1;

            }

            System.out.println(num);

        }
    }

    public static void main(String[] args) {
        iteration4(9);
        iteration4(5);
    }

}
