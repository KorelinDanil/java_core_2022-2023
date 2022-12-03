package lr2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int a = in.nextInt();
        if (a%4 == 0 && a>=10)
        {
            System.out.println("Условие выполнено");
        }
        else
        {
            System.out.println("Условие не выполнено");
        }
        in.close();
    }
}
