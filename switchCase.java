import java.util.Scanner;

public class switchCase {

    public static void main(String[] args){

        double x, y;
        String operator;

        System.out.print("Enter the first Operand: ");
        x = new Scanner(System.in).nextDouble();

        System.out.print("Enter the Operator: ");
        operator = new Scanner(System.in).nextLine();

        System.out.print("Enter the Second Operand: ");
        y = new Scanner(System.in).nextDouble();


        switch (operator){

            case "+":
                System.out.print(x + " + " + y + " = " + (x + y));
                break;

            case "-":
                System.out.print(x + " - " + y + " = " + (x - y));
                break;

            case "*":
                System.out.print(x + " x " + y + " = " + (x * y));
                break;

            case "/":
                System.out.print(x + " / " + y + " = " + (x / y));
                break;

            default:
                System.out.print(x + " % " + y + " = " + (x % y));

        }


    }

}
