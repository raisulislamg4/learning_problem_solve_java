public class summation_0_to_n_from_array {

    public static void main(String[] args){

        int array[] = new int[]{5, 10, 15, 20};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("summation of all value of the array: " + sum);
    }

}
