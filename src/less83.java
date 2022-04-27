import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class less83 {
    public static void main(String[] args) { //Напишите программу на Java для поиска наибольшего элемента между первым,
        // последним и средним значениями массива целых чисел (четной длины)

        int[] first = {1,-5,7,9,6,3};
        int[] second = {4,7,9,5,6,7};
        int[] res = new int[6];
        String  resIn = "";

        for (int i =0; i<=5; i++){
            res[i] = first[i]*second[i];
            resIn += first[i]*second[i]+", ";
        }
        System.out.println(Arrays.toString(res));
        System.out.println(resIn.substring(0,resIn.length()-2));

    }
}
