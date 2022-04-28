import java.util.Arrays;
import java.util.Scanner;

public class less87 { //Напишите программу на Java, которая читает целое число, вычисляет сумму его цифр и записывает
    // число каждой цифры суммы на английском языке.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
         String  in = scanner.nextLine();
         char[] inArray = in.toCharArray();
         int sum = 0;
         int[] inNum = new int[2];

         for (int i = 0; i<=inArray.length-1; i++){
             sum += inArray[i]-'0';
         }
        for (int i = 0; i<=inArray.length-1; i++){
            inNum[i] += inArray[i]-'0';
        }


        int first = inArray[0]-'0';
        System.out.println(Arrays.toString(inArray));
        System.out.println(sum);
        System.out.println(Arrays.toString(inNum));







    }
}
