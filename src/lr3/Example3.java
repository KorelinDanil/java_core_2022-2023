package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну ряда: ");
        int length = in.nextInt();
        int y = 0;
        int result=1;
        if (length%2==0)
        {
            for (int i =1;i<=length;)
            {
                result = result + y;
                y += result;
                System.out.printf("%d,", result);
                i=i+2;
                if (i!=length) {
                    System.out.printf("%d,", y);
                }

            }
        }
        else
        {
            for (int i =1;i<=length;)
            {
                result = result + y;
                y += result;
                System.out.printf("%d,", result);
                i=i+2;
                if (i<=length) {
                    System.out.printf("%d,", y);
                }
            }
        }
        in.close();
    }
}
