import java.util.Scanner;

public class string_p1 {

        public static void main(String[] args){

            System.out.println("Please Enter a String: ");
            String str = new Scanner(System.in).nextLine();

            char[] charArray = str.toCharArray();
            int wordCount = 0;

            for (int i = 0; i <= charArray.length - 2; i++){

                if (charArray[i] != ' ' && charArray[i+1] == ' '){

                    wordCount++;

                }

            }
            if (charArray[charArray.length-1] == ' '){
                wordCount--;
            }

            System.out.println(wordCount + 1);


        }

}
