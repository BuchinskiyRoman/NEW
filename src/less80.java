public class less80 {
    public static void main(String[] args) { //Напишите программу на Java для поиска наибольшего элемента между первым,
        // последним и средним значениями массива целых чисел (четной длины)

        int[] first = {3,2,3,4,5,6,22};

        if (first[0]>first[first.length/2]){
            if (first[0]>first[first.length-1]){
                System.out.println(first[0]);
            }
        } else if (first[first.length/2]>first[first.length-1]) {
            System.out.println(first[first.length/2]);
            }else {
            System.out.println(first[first.length-1]);
        }


    }
}
