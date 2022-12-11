package lr3;

import java.io.IOError;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size=0;
        try {
            size = in.nextInt();
        }
        catch (java.util.InputMismatchException mismatchException){};
        if (size >0)
        {
            System.out.println("Размер массива = "+size);
            int[] array = new int[size];
            Random random = new Random();

            for (int i=0;i< array.length;)
            {
                int x = random.nextInt(200);
                if (x%5==2)
                {
                    array[i] = x;
                    System.out.println("Элемент массива ["+i+"]="+array[i]);
                    i++;
                }
                else
                {
                    continue;
                }
            }
        }
        else
        {
            System.out.println("Неккоректный размер массива");
        }
    }
}
