// Учитывая входную строку s, измените порядок слов на противоположный .
// Слово определяется как последовательность не пробельных символов. 
// Слова в будут разделены хотя бы одним пробелом .s
// Возвращает строку слов в обратном порядке, объединенных одним пробелом.
// Обратите внимание , что sможет содержать начальные или конечные пробелы или несколько 
// пробелов между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова.
//  Не включайте никаких дополнительных пробелов.

package sem1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = iScanner.nextLine();

        text = text.replaceAll("[\\s]{2,}", " ");

        String[] Array = text.split(" ");

        System.out.println(Array);
        for (int index = Array.length - 1; index > 0; index--) {
            System.out.print(Array[index] + " ");

        } 
        iScanner.close();
    }
}
