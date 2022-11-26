package lr1;
import java.util.Calendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println("Введите Имя: ");
        String Name = in.nextLine();

        System.out.println("Введите свой год рождения: ");
        int birthYear = in.nextInt();
        int age = currentYear-birthYear;
        System.out.printf("%s, %d лет",Name,age);

        in.close();
    }
}