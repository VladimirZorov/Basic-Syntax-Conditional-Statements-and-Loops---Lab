package Zadachi.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (b > 10) {
            System.out.printf("%d X %d = %d ",a,b, a * b);
        } else {
            for (int i = b; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", a, i, a * i);
            }
        }
    }
}
