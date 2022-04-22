import java.util.Scanner;

public class lesson59 { // преобразовывает буквы в предложении с низким регистром в заглавные.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentences: ");
        String line = scanner.nextLine();
        line = line.toUpperCase();
        System.out.println(line);


    }
}
