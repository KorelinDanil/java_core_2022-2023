package lr3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен " + size);
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + array[i]);
        }
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("Массив отсортирован");
        for (int i = 0;i<array.length;i++)
        {
            System.out.println("Элемент массива ["+i+"] = "+array[i]);
        }
    }
}
