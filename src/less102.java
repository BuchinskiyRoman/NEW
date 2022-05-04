public class less102 {
    public static void main(String[] args) { // Напишите программу на Java, чтобы проверить, содержит ли указанный массив целых чисел 10 или 30.

        int[] num = {10,2,3,1,1,3,2,2,6,2,1,2};
        int res = 0;



        for (int i = 0; i<=num.length-1; i++){
            if (num[i]==10 || num[i]==30){
                res = 1;
            }
                    }
        if (res==1){
            System.out.println("10 and 30 is");
        }else
            System.out.println("No one!");

    }
}
