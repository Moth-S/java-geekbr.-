//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
//двухзначных элементов массива.

package sem2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter numbers through space: ");
        String numbers = iScanner.nextLine();
        String[] arrNumber = numbers.split(" ", 0);
        // System.out.println(arrNumber);
        int sumTwoDigitNum=0;

        for (int index = 0; index < arrNumber.length; index++) {
            if (Math.abs(Integer.parseInt(arrNumber[index]))>9 && Math.abs(Integer.parseInt(arrNumber[index]))<100) {
                sumTwoDigitNum+=index;
            }
        }

        for (int index = 0; index < arrNumber.length; index++) {
            if (Integer.parseInt(arrNumber[index])<0) {
                arrNumber[index]=Integer.toString(sumTwoDigitNum);
            }
        }

        for (int index = 0; index < arrNumber.length; index++) {
            System.out.print(arrNumber[index]+" ");
        }
        iScanner.close();
    }
}
