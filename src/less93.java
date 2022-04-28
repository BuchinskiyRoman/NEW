import java.util.Arrays;

public class less93 {
    public static void main(String[] args) {

        int[] w = {1,2,3,4,5,6,7,8,9};
        int y = 123456789;
        System.out.println("Array: "+Arrays.toString(w));
        System.out.println("Strind: "+String.valueOf(y));
        String myString = String.valueOf(Arrays.toString(w));
        char[] myChar = myString.toCharArray();
        System.out.println("Char charekters from array: "+myChar[0] +""+ myChar[2]);

    }
}
