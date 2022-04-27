import java.util.Arrays;

public class less81 {
    public static void main(String[] args) {

        int[] first = {3,2,3,4,5,6,22};
        System.out.println(Arrays.toString(first));

        int max = first[0];
        if (max<=first[first.length/2]){
            max = first[first.length/2];
        }if (max<=first[first.length-1]){
            max=first[first.length-1];
        }
        System.out.println("Max: "+max);
    }
}
