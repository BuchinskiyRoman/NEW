import java.util.Scanner;

public class lesson64 {
    public static void main(String[] args) { // 64. Напишите программу на Java, которая принимает два целых
                                            // числа от 25 до 75 и возвращает значение true, если в обоих
                                             //  числах есть общая цифра

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number (25...75): ");
        int first = scanner.nextInt();
        System.out.print("Input second number (25...75): ");
        int second = scanner.nextInt();

        System.out.println("Result: " + result(first, second));

    }

    public static boolean result(int x, int y) {
        if (x < 25 || y > 75)
            return false;

        int q = x % 10;
        int w = y % 10;
        x = x / 10;
        y = y / 10;
        return (x == q || x == w || y == q || y == w);
        }

}
