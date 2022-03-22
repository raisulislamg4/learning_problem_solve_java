import java.util.Scanner;

public class LeapYear {

    static int inputYear(){

        System.out.print("Enter the Year: ");
        return new Scanner(System.in).nextInt();

    }

    static void leapYearChecket(int year){

        if (year % 4 == 0){
            System.out.println(year + " is Leap Year!");
        }
        else {
            System.out.println(year + " is not Leap Year!");
        }

    }

    public static void main(String[] args) {

        int year;

        year = inputYear();
        leapYearChecket(year);

    }
}
