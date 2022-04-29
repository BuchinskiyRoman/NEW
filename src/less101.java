public class less101 {
    public static void main(String[] args) { // Write a Java program to check if the number of 10 is greater than number
                                            // to 20s in a given array of integers.

        int[] num = {10,20,56,10,10,20,20,2,6,2,1,20};
        int ten = 0;
        int too = 0;

        for (int i = 0; i <=num.length-1; i++){
            if (num[i]==10){
                ten++;
            }
            if (num[i]==20){
                too++;
            }
        }
        System.out.println("ten: "+ten);
        System.out.println("too: "+too);
    }
}
