public class max_value_from_array {

    public static void main(String[] args) {

        int[] array = new int[]{10, 21, 14, 35, 19};
        int big = array[0];

        for (int i = 0; i < array.length; i++){

            if (big < array[i]){
                big = array[i];
            }
        }

        System.out.println("greatest number from the array is: " + big);

    }

}
