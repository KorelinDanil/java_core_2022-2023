package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя и Возраст");
        String NameAndAge = in.nextLine();
        System.out.printf("%s",NameAndAge);
        in.close();
    }
}
