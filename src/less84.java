public class less84 {
    public static void main(String[] args) { //Напишите программу на Java, которая берет последние три символа из заданной строки
        // и добавляет три символа в начало и конец строки. Длина строки должна быть больше трех и более.

        String  word = "Python";
        String wordThri = word.substring(word.length()-3);
        System.out.println(wordThri+word+wordThri);
    }
}
