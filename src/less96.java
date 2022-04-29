public class less96 {
    public static void main(String[] args) {//Write a Java program to check if there is a 10 in a given array of integers
                                            // with a 20 somewhere later in the array.

        int[] num = {10,32,56,8,5,2,7,9,6,25,47,1};

        int res = 0;

        for (int i = 0; i<=num.length-1;i++){
            if (num[i]==10){
                for (int j = 0; j<=num.length-1;j++){
                    if (num[j]==20){
                        res = 1;
                        System.out.println(true); //при условии если всё совпало это правда и присваеваем 1
                                                // и переходим к следующему условию
                    }
                }
            }
        } if (res == 0)
            System.out.println(false);



    }
}
