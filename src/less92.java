public class less92 {
    public static void main(String[] args) { //93. Напишите программу на Java, чтобы проверить, содержит ли массив целых
                                            // чисел элемент 10 рядом с 10 или элемент 20 рядом с 20, но не оба вместе

        int[] num = {1,32,1,10,5,4,20,20,6,25,47,1};

        for (int i = 0; i<= num.length-1; i++){
            if (num[i + 1] == 10 && num[i] == 10){
                    System.out.println("10,10");
                }
            if (num[i + 1] == 20)
                if (num[i]==20) {
                    System.out.println("20,20");
                }
        }




    }
}
