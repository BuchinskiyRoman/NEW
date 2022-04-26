import java.util.Scanner;

public class lesson73 {
    public static void main(String[] args) { //Напишите программу на Java для создания новой строки, берущей первый и последний
                        // символы из двух заданных строк. Если длина любой строки равна 0, используйте «#» для отсутствующего символа

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first word: ");
        String first = scanner.nextLine();
        System.out.print("Input second wold: ");
        String second = scanner.nextLine();


        System.out.print(first.charAt(0));
        System.out.println(second.charAt(second.length()-1));
    }
}
