import java.util.Scanner;

public class lesson67 {
    public static void main(String[] args) { // Вставьте «Tutorial» в середине «Python 3.0», чтобы в результате получился
                                              //пример вывода Python Tutorial 3.0:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input(Python 3.0): ");
        String first = scanner.nextLine();
        System.out.print("Input(Tutorial): ");
        String second = scanner.nextLine();

        String[] a = first.split(" ");
        System.out.println(a[0]+" "+second+" "+a[1]);
    }
}
