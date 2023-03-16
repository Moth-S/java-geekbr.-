//Дана последовательность N целых чисел. Найти сумму простых чисел.

package sem2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int N = iScanner.nextInt();
        int sumPrimeNumbers = 0;
        int num;

        for (int index = 0; index < N; index++) {
            num = iScanner.nextInt();
            if (PrimeNumber(num) == 1) {
                sumPrimeNumbers += num;
            }
        }
        System.out.println(sumPrimeNumbers);
        iScanner.close();
    }

    public static int PrimeNumber(int number) {
        int numberDiv = 0;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                numberDiv++;
            }
        }
        if (numberDiv == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
