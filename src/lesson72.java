import java.util.Scanner;

public class lesson72 {
    public static void main(String[] args) { //Напишите программу на Java для создания новой строки, берущей первые три символа
                        // из заданной строки. Если длина данной строки меньше 3, используйте «#» в качестве замещающих символов.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type sentences: ");
        String line = scanner.nextLine();

        int lineNum = line.length();
         if (lineNum>=3){
             System.out.println(line.substring(0,3));
             System.out.println(line.length());
         }else if (lineNum==1){
             System.out.println(line.charAt(0)+"#"+"#");
         } else{
             System.out.println("#"+"#"+"#");
         }
    }
}
