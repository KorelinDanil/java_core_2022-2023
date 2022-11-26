package lr1;
import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(calendar.YEAR);

        System.out.print("Введите ваш возраст:");
        int age = in.nextInt();

        int birthDate = currentYear-age;

        System.out.println("Ваш год рождения: "+birthDate);

        in.close();
    }
}
