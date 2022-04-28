import java.util.Arrays;

public class less94 {
    public static void main(String[] args) { // 94. Напишите программу на Java, которая переставляет все элементы
                                                    // заданного массива целых чисел так, чтобы все нечетные числа
                                                        //  стояли перед всеми четными числами

        int[] num = {1,32,1,10,5,4,20,20,6,25,47,1};
        int[] result = new int[12];






        for (int i = 0; i<= num.length-1;i++){
            if (num[i]%2==0){
               result[i] = num[i];
            }else {
                result[num.length-1] = num[i];
            }
        }


        System.out.println(Arrays.toString(result));
        }



}
