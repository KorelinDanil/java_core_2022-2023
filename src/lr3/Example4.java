package lr3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        String str="";

        if (b>a)
        {
            for (int i = a; i<=b; i++)
            {
                str+=i+",";
            }

        } else if (a>b)
        {
            for (int i =b;i<=a;i++)
            {
                str+=i+",";
            }
        }
        else if (a==b)
        {
            System.out.print("Числа равны");
        }
        str=str+"\b";
        System.out.println(str);
    }
}
