public class less90 {
    public static void main(String[] args) { //91. Напишите программу на Java для измерения времени выполнения
                                        // некоторого кода в наносекундах.
      long startTime = System.nanoTime();

       for (int i =0;i<=10;i++){
           System.out.println(i);
       }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

    }
}
