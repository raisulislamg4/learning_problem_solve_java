public class pattern_p3 {

    public static void main(String[] args){

        int row = 7;

        for (int i = 1; i <= row; i++){

            for (int j = 1; j <= i; j++){

                if (j > 1) {
                    System.out.printf("  ");
                }

            }
            for (int j = i; j <= row; j++){

                System.out.printf("* ");

            }
            System.out.println("");
        }

    }
}
