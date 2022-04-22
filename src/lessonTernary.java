import java.util.Scanner;

public class lessonTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();

        System.out.println("Result: "+ ((x>y)?x:y));
    }
}
