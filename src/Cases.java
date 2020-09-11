import jdk.swing.interop.SwingInterOpUtils;

class selektion_1 {

        static void selektion1(int x, int y, int z) {

            System.out.println("a:" + (x <= 5 && z != y));
            System.out.println("b:" + (x == 5 || x == y && z == 3));
            System.out.println("c:" + (x / y > z / x));
            System.out.println("d:" + (!(x != y - z) == false));
            System.out.println("e:" + (2 * x != x || x == 0));
            System.out.println("f:" + (!true || !false));

        }

    public static void main(String[] args) {
        selektion1(5,8,3);
        System.out.println("");
        selektion1(-2,1,9);
    }

}

class selektion_2{

    static void selektion2(int x, int y){

        if ((x + y) > 100){

            System.out.println("summen er større end 100");

        }else if((x + y) < 100){

            System.out.println("summen er ikke større end 0");

        }

        else{

            System.out.println("summen er lig 100");

        }


    }

    public static void main(String[] args) {

        selektion2(41,67);
        selektion2(50,50);

    }

}


class selektion_3{

    static void selektion3(int first, int second){

        if (first > second){

            System.out.println(first);

        } else if ( first < second ) {

            System.out.println(second);

        }else{
            System.out.println("both are " + first );
        }

    }

    public static void main(String[] args) {

        selektion3(7,2);
        selektion3(2,2);
        selektion3(3,9);

    }

}

class selektion_4{
    static void selektion4(int first, int second, int third){

        if ((first > second) && > third)){

            System.out.println(first);

        } else if ( (second > first) && (second > third)) {

            System.out.println(second);

        }else if ((third > first) && (third > second)){

            System.out.println(third);

        }

    }

    public static void main(String[] args) {

        selektion4(7,3,5);

    }

}
