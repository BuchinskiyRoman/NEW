import java.util.Scanner;

public class lesson69 {
    public static void main(String[] args) {  // Напишите программу на Java для извлечения первой половины строки четной длины.
                                                // Перейдите в редактор


        Scanner scanner = new Scanner(System.in);
        System.out.print("Type sentences: ");
        String line = scanner.nextLine();

        String lineHalf = line.substring(0,line.length()/2); // Метод substring() в Java имеет два варианта и возвращает
                                                            // новую строку, которая является подстрокой данной строки.
                                                            // Подстрока начинается с символа, заданного индексом, и продолжается
                                                            // до конца данной строки или до endIndex-1, если введен второй аргумент.

        System.out.println(lineHalf);
    }
}
