// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

package sem1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int temp;
        int summaElem = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = iScanner.nextInt();
        String str = Integer.toString(number);
        temp = number;

        while (number != 0) {
            number = iScanner.nextInt();
            str = str + " " + Integer.toString(number);
            if (number < 0) {
                summaElem = summaElem + temp;
            }
            temp = number;
        }
        System.out.println(str);
        System.out.println(summaElem);

        iScanner.close();

    }
}
