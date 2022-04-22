import java.util.Scanner;

public class lessonTernary {
    public static void main(String[] args) { //возвращает максимальное значение.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();

        System.out.println(res(first,second));


    }
    public static int res (int x,int y){
       return ((x>y)?x:y); // тернарный оператор. Если верно условие возвращает первое значение, а если нет то второе.
    }
}
