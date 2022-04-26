import java.lang.reflect.Array;
import java.util.Arrays;

public class less77 {
    public static void main(String[] args) { //Напишите программу на Java для создания нового массива длины 2 из двух массивов
        // целых чисел с тремя элементами, и новый массив будет содержать первый и последний элементы из двух массивов

        int[] first = {1,5,7,9,6,3};
        int[] second = {45,78,96,55};
        int[] thred = {first[0],second[second.length-1]};



        System.out.print(Arrays.toString(thred));


    }
}
