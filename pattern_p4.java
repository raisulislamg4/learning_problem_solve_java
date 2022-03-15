public class pattern_p4 {

    public static void main(String[] args){

        int row = 7;

        for (int i = 1; i <= row; i++){

            for (int j = i; j <= row; j++){

                System.out.printf(" ");

            }

            for (int j = 1; j <= i; j++){

                System.out.printf("* ");

            }
            System.out.println("");

        }

    }

}
