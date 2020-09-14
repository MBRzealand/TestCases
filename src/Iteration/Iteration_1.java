package Iteration;

class Iteration_1 {

    static void iteration1(int x, int y) {
        int number = 0;

        for (int i = x; i <= y; i++) {
            number += i;

        }

        System.out.println(number);

    }

    public static void main(String[] args) {
        iteration1(-100, 100);
    }

}
