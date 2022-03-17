public class pattern_p5 {

    public static void main(String[] args) {

        int midLineStarCount = 7;

        for (int i = 1; i <= midLineStarCount; i++) {

            for (int j = i; j <= midLineStarCount; j++) {

                System.out.printf(" ");

            }

            for (int j = 1; j <= i; j++) {

                System.out.printf("* ");

            }
            System.out.println("");

        }

        for (int i = 1; i <= midLineStarCount - 1; i++) {

            for (int j = 1; j <= i + 1; j++) {

                System.out.printf(" ");

            }

            for (int j = 1; j <= midLineStarCount - i; j++) {

                System.out.printf("* ");

            }
            System.out.println("");

        }
    }

}
