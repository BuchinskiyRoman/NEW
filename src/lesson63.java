import java.util.Scanner;

public class lesson63 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input fearst number: ");
        int fearst = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();

        if (fearst>second){
            System.out.println(fearst);
        }else {
            System.out.println(second);
        }

        if (fearst==second){
            System.out.println("0");
        }

        if (fearst%6==second%6){
            if (fearst<second){
                System.out.println(fearst);
            }else {
                System.out.println(second);
            }
        }
    }
}
