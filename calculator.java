import java.util.Scanner;

public class calculator {

    static double takeFirstInput(){

        System.out.print("Enter the first Operand: ");
        return new Scanner(System.in).nextDouble();

    }

    static double takeSecoondInput(){

        System.out.print("Enter the Second Operand: ");
        return new Scanner(System.in).nextDouble();

    }

    static String takeOperatorInput(){

        System.out.print("Enter the Operator: ");
        return new Scanner(System.in).nextLine();

    }

    static void sum(double x, double y){

        System.out.print(x + " + " + y + " = " + (x + y));

    }

    static void sub(double x, double y){

        System.out.print(x + " - " + y + " = " + (x - y));

    }

    static void mul(double x, double y){

        System.out.print(x + " x " + y + " = " + (x * y));

    }

    static void div(double x, double y){

        System.out.print(x + " / " + y + " = " + (x / y));

    }

    static void mode(double x, double y){

        System.out.print(x + " % " + y + " = " + (x % y));

    }

    static void calculate(double x, double y, String operator) {

        switch (operator) {

            case "+":
                sum(x, y);
                break;

            case "-":
                sub(x, y);
                break;

            case "*":
                mul(x, y);
                break;

            case "/":
                div(x, y);
                break;

            default:
                mode(x, y);

        }

    }

    public static void main(String[] args){

        double x, y;
        String operator;

        x = takeFirstInput();
        operator = takeOperatorInput();
        y = takeSecoondInput();

        calculate(x, y, operator);

    }

}
