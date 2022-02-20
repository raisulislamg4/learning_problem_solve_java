public class min_value_from_array {

    public static void main(String[] args) {

        int[] array;
        array = new int[]{4, 6, 2, 1};
        int small=array[0];


        for (int i = 0; i < array.length; i++) {

            if(array[i] < small){
                small = array[i];
            }
        }
        System.out.println("Smallest number from the array is: " + small);

    }

}
