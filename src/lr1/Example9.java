package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String mounth = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int days = in.nextInt();

        System.out.printf("В месяце \"%s\" %d дней",mounth, days);
        in.close();

    }
}