public class less99 {
    public static void main(String[] args) { //99. Напишите программу на Java, которая проверяет, встречается ли указанное
                                                // число в каждой паре соседних элементов заданного массива целых чисел.

        int[] num = {10,20,56,10,10,20,0,2,6,2,1,20};
        int res = 1;
        int x = 20;

        for (int i = 0; i <=num.length-2; i++){
            if (num[i]==x && num[i+1]==x){
                res = 0;
            }
        }

        if (res==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
