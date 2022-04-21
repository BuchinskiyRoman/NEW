import java.util.Scanner;

public class lesson58 {
    public static void main(String[] args) { // преобразует первую букву каждого слова в заклавную.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentences: ");
        String in = scanner.nextLine();

        String upper_case_line = "";

        Scanner lineScan = new Scanner(in);

        while (lineScan.hasNext()){
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(upper_case_line.trim());


    }
}

}
