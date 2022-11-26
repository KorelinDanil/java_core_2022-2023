package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String SecondName = in.nextLine();

        System.out.println("Введите Имя: ");
        String Name = in.nextLine();

        System.out.println("Введите отчество: ");
        String Patronymic = in.nextLine();

        System.out.printf("Hello %s %s %s",SecondName,Name,Patronymic);

        in.close();
    }
}
