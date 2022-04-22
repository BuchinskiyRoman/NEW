import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lesson60 { // из строки выводит предпоследнее слово.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentences: ");
        String line = scanner.nextLine();
        String[] word = line.split(" ");
        System.out.println(" Word: "+ word[word.length - 2]);


    }
}
