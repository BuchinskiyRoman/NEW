import java.util.Scanner;

public class lesson72 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type sentences: ");
        String line = scanner.nextLine();

        int lineNum = line.length();
         if (lineNum>=3){
             System.out.println(line.substring(0,2));




        }
    }
}
