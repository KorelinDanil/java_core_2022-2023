package lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество суммируемых чисел: ");
        int size = in.nextInt();
        if (size >0)
        {
            System.out.println("Количество чисел = "+size);
            int[] array = new int[size];
            Random random = new Random();
            int sum=0;

            for (int i=0;i<array.length;)
            {
                int x = random.nextInt(100);
                if (((x % 5) == 2) || ((x % 3 == 1)))
                {
                    array[i] = x;
                    sum=sum+x;
                    System.out.println("Число ["+i+"]="+array[i]);
                    i++;
                }
                else
                {
                    continue;
                }

            }
            System.out.println("Сумма чисел = "+sum);
        }
        else
        {
            System.out.println("Неккоректный ввод");
        }


    }
}
