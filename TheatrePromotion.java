package Zadachi.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                    System.out.printf("%d$",ticketPrice);
                    break;
                } else {
                    System.out.println("Error!");
                    break;
                }

            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }else {
                    System.out.println("Error!");
                    break;
                }
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }
                if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                    System.out.printf("%d$",ticketPrice);
                    break;
                }else {
                    System.out.println("Error!");
                    break;
                }
        }
    }
}
