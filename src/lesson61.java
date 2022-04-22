import java.util.Scanner;

public class lesson61 {
    public static void main(String[] args) { // возвращает буквы в слове в обратном порядке.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = scanner.next();
        char[] wordChar = word.toCharArray();
        String result =" ";
        for (int i = wordChar.length-1; i>= 0; i--){
            result+=wordChar[i];
        }
        System.out.println(result);
    }
}
