//Дана последовательность N целых чисел. Верно ли, что последовательность является возрастающей?

package sem2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int N = iScanner.nextInt();
        int flag = 1;

        int[] arrNumbers=new int[N];

        for (int index = 0; index < N; index++) {
            arrNumbers[index] = iScanner.nextInt();
        }

        for (int index = 1; index < arrNumbers.length; index++) {
            if (arrNumbers[index-1]<arrNumbers[index]) {
                flag*=1;
            }
            else {
                flag*=0;
            }
        }
        if (flag==1) {
            System.out.println("возрастающая");
        } else {
            System.out.println("не возрастающая");
        }
        iScanner.close();
        }
    }

