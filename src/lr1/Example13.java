package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.printf("%d + %d = %d",x,y,x+y);
        in.close();
    }
}
