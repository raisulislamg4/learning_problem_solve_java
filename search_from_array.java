public class search_from_array {

    public static void main(String[] args){

        int[] array = new int[]{15, 42, 23, 54, 34, 65, 22};

        int search = 65;
        int match_at = 0;

        for (int i =0; i < array.length; i++){
            if (array[i] == search){
                match_at = i;
            }

        }

        System.out.println(search + "found at array index: " + match_at);

    }

}
