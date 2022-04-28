public class lesso91 {
    public static void main(String[] args) {//92. Напишите программу на Java для подсчета количества четных и нечетных
                                                // элементов в заданном массиве целых чисел

        int[] num = {1,32,56,8,5,4,7,9,6,25,47,1};
        int even = 0;
        int odd = 0;

        for (int i = 0; i<= num.length-1;i++){
            if (num[i]%2==0){
                even+=1; // even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: "+ even);
        System.out.print("Odd: "+ odd);

    }
}
