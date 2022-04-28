public class less86 {
    public static void main(String[] args) { //Напишите программу на Java, начните с целого числа n, разделите n на 2, если n
        // четное, или умножьте на 3 и прибавьте 1, если n нечетное, повторяйте процесс, пока n = 1

        int n = 10;
        while (n!=1){
            if (n % 2 == 0){
                n = n/2;
        }else {
                n = (n * 3 + 1)/2;
            }

        }
        System.out.println(n);
    }
}
