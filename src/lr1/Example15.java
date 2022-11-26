package lr1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int x = in.nextInt();
        int y = in.nextInt();

        int sum = x+y;
        int raz = x-y;

        System.out.printf("%d + %d = %d\n",x,y,sum);
        System.out.printf("%d - %d = %d\n",x,y,raz);
        in.close();
    }
}
