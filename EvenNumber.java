package Zadachi.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int n = 1;
        for (int i = 1; i <= n; i++) {
            if (a % 2 != 0) {
                System.out.println("Please write an even number.");
                n++;
              a = scanner.nextInt();
            } else {
                System.out.printf("The number is: %d", Math.abs(a));
                break;
            }
        }
    }
}