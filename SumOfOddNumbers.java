package Zadachi.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumI = 0;
        int a = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.println(a);
            sumI+=a;
            a +=2;
        }
        System.out.println("Sum: " + sumI);
    }
}
