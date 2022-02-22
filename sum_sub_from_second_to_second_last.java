public class sum_sub_from_second_to_second_last {

    public static void main(String[] args) {

        int array[] = new int[]{5, 10, 15, 25, 30, 20};

        int sum = 0;
        int sub = 0;

        for (int i = 0; i < array.length - 2; i++) {
            sum += array[i + 1];
        }

        array[array.length - 1] = sum;
        System.out.println("summation of 1st index to 2nd last index: " + array[array.length - 1]);


        for (int i = 0; i < array.length - 3; i++) {
            sub += array[i + 1] - array[i + 2];
        }

        array[array.length - 1] = sub;
        System.out.println("subtraction if 1st index to 2nd last index: " + array[array.length - 1]);

    }
}
