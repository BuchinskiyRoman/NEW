public class less97 {
    public static void main(String[] args) {// 97. Напишите программу на Java, чтобы проверить, содержит ли массив целых
                                            // чисел заданное число рядом друг с другом или есть два одинаковых заданных
                                           // числа, разделенных одним элементом.

        int[] num = {10,32,56,10,10,2,7,9,6,20,1,20};
        int res = 1;

        for (int i = 0; i<=num.length-2; i++ ){
            if (num[i]==10 && num[i+1]==10){
                System.out.println("10, 10");
                res = 0;
            }
        }

        for (int i = 0; i<=num.length-3; i++ ){
            if (num[i]==20 && num[i+2]==20){
                System.out.println("20, 20");
                res = 0;
            }
        }

        if (res==1)
        System.out.println("NO!");
    }
}
