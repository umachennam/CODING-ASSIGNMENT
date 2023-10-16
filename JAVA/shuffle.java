import java.util.Arrays;
import java.util.Random;
/**
 * shuffle_program
 */
public class shuffle_program {

    public static void main(String[] args) {
        int[] array = {11,13,15,16,18,19,23,50};

        // create instance of Random class
        Random random_no = new Random();

        for(int i =0;i<array.length;i++){
            int random_index = random_no.nextInt(array.length);
            int temp = array[random_index];
            array[random_index]= array[i];
            array[i]=temp;

        }
        System.out.println(Arrays.toString(array));
    }
}