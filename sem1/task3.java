// Учитывая две двоичные строки aи b, верните их сумму в виде двоичной строки .

package sem1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter first binary nubmer: ");
        String fBinNum = iScanner.nextLine();
        int firstBinNum=Integer.parseInt(fBinNum,2);

        System.out.println("Enter second binary nubmer: ");
        String sBinNum = iScanner.nextLine();
        int secondBinNum=Integer.parseInt(sBinNum,2);

        System.out.println(Integer.toBinaryString(firstBinNum+secondBinNum));
        iScanner.close();
    }
}
