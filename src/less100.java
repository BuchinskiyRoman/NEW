public class less100 {
    public static void main(String[] args) { //100. Напишите программу на Java для подсчета двух элементов двух заданных
                                            // массивов целых чисел одинаковой длины, отличающихся на 1 или меньше.

        int[] num1 = {10, 20, 56, 10};
        int[] num2 = {11, 23, 55, 5};
        int res = 0;


        for (int i = 0; i <=num1.length-1; i++){
            if (Math.abs(num1[i]-num2[i])<=1 && num1[i]!=num2[i]){
                res++;
            }
        }
        System.out.println(res);
    }
}
