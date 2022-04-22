import java.util.Scanner;

public class lesson68 {
    public static void main(String[] args) { // Напишите программу на Java для
                                            // создания новой строки из 4 копий последних 3 символов исходной строки.
                                             // Длина исходной строки должна быть 3 и выше
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentence: ");
        String sentence = scanner.nextLine();
        String lastThri = sentence.substring(sentence.length()-3);

        System.out.println(lastThri + lastThri + lastThri + lastThri);

    }
}
