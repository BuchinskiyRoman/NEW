public class lesson71 {
    public static void main(String[] args) { // Напишите программу на Java для создания конкатенации двух строк, за исключением
                                            // удаления первого символа каждой строки. Длина строк должна быть 1 и выше.

        String str1 = "Python";
        String str2 = "Tutorial";

        System.out.println(str1.substring(1,str1.length())+str2.substring(1));
    }
}
