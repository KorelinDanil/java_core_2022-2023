package lr2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int a = in.nextInt();
        int result = a%5;
        int result2 = a%7;


        if (result ==2 && result2==1)
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
