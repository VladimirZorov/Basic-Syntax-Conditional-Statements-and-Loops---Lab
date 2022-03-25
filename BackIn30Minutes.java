package Zadachi.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int time = hours * 60 + minutes + 30;
        int newHour = time / 60;
        int newMinutes = time % 60;
        if (newHour > 23) {
            newHour = 0;
        }
        if (newMinutes > 59) {
            newMinutes = newMinutes - 60;
            newHour ++;
        }
        System.out.printf("%d:%02d", newHour, newMinutes);
    }
}
