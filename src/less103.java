import java.util.Arrays;

public class less103 {
    public static void main(String[] args) {//Напишите программу на Java для создания нового массива из заданного массива
        // целых чисел, новый массив будет содержать элементы из заданного массива после значения последнего элемента 10.

     int[] num = {10, 45, 23, 56 ,89, 8, 45, 10, 5, 2, 78, 6};
     int l = 0;


     for (int i = num.length-1; i >= 0; i--){
         if (num[i]!=10){
            l++;
         }
     }
      int[] numNew = new int[l];
     for (int i = l+1; i<num.length; i++){
         numNew[i-l-1]=num[i];
         System.out.println(Arrays.toString(numNew));
     }


    }
}
