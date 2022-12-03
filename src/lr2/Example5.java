package lr2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int a = in.nextInt();
        int result = (a/1000)%10;
        System.out.printf("В числе %d - %d тысяч",a,result);
        in.close();
    }
}
