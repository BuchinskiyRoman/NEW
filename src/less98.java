public class less98 {
    public static void main(String[] args) {//98. Напишите программу на Java, чтобы проверить, встречается ли значение 20
                                            // три раза и нет ли 20 рядом друг с другом в заданном массиве целых чисел.


        int[] num = {10,20,56,10,10,20,20,2,6,2,1,20};
        int res = 1;
        int sum = 0;

        for (int i = 0; i <=num.length-1; i++){
            if (num[i]==20){
                sum += 1;
            }
        }
        if (sum>=3){
            System.out.println("20 tnree times");
            res = 0;
        }
        for (int i = 0; i <=num.length-2; i++){
            if (num[i]==20 && num[i+1]==20){
                System.out.println("20, 20");
                res=0;
            }
        }


        if (res==1){
            System.out.println("NO!");
        }
    }
}
