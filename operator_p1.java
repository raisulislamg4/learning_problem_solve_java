public class operator_p1 {

    public static void main(String[] args) {

        double x, y, add, sub, mul, quo, rem;

        x = 5;
        y = 10;

//        add = x + y;
//        sub = x - y;
//        mul = x * y;
//        quo = x / y;
//        rem = x % y;
//
//        System.out.println("Addition: " + add + '\n' + "Subtraction: " + sub + '\n' +
//                "Multiplication: " + mul + '\n' + "Quotient: " + (int)quo + '\n' + "Reminder: " + rem );



        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Quotient: " + (int)(x / y));
        System.out.println("Reminder: " + (int) (x % y));

    }
}
