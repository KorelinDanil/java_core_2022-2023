package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели");
        String weekDay = in.nextLine();

        System.out.println("Введите название текущего месяца");
        String mounth = in.nextLine();

        System.out.println("Введите дату(номер дня в месяце)");
        int date = in.nextInt();

        System.out.printf("Сегодня %s, %d число, %s",weekDay,date,mounth);

        in.close();
    }
}
