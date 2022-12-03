package lr2;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int a = in.nextInt();
        if (a%3==0)
        {
            System.out.print("Число делится на 3");
        }
        else
        {
            System.out.print("Число не делится на 3");
        }
        in.close();
    }
}
