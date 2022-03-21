import java.util.Scanner;

public class string_p2_3 {

    public static void main(String[] args){

        System.out.println("Please Enter a String: ");
        String str = new Scanner(System.in).nextLine();

        char[] strArray = str.toCharArray();
        char[] uniqArray = new char[strArray.length];
        int index = 0;


        for (int i = 0; i <= strArray.length - 1; i++){

            int flag = 0;

            for (int j = 0; j < i; j++){

                if (strArray[i] == strArray[j]){
                    flag = 1;
                    break;
                }

            }

            if (flag == 0){
                uniqArray[index] = strArray[i];
                index++;
            }

        }

        for (int i = 0; i < index; i++){

            int charFreq = 0;
            for (int j = 0; j <= strArray.length-1; j++){

                if (uniqArray[i] == strArray[j]){
                    charFreq++;
                }

            }
            System.out.println(uniqArray[i] + " = " + charFreq);
        }

    }

}
