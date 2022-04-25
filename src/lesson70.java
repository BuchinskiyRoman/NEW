import java.util.Scanner;

public class lesson70 {
    public static void main(String[] args) { // Напишите программу на Java для создания строки в форме короткая_строка +
                            // длинная_строка + короткая_строка из двух строк. Строки не должны иметь одинаковую длину.

        String str1 = "Python";
        String str2 = "Tutorial";

        if (str1.length()>str2.length()){
            System.out.println(str2+str1+str2);
        }else {
            System.out.println(str1+str2+str1);
        }


    }
}
