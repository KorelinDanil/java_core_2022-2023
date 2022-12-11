package lr3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int min;
        int count=0;
        String str="";
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        int[] temp_nums = new int[size];
        Random random = new Random();
        boolean found = false;
        //цикл заполнения массива случайными числами
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            temp_nums[i] = nums[i]; //копирование основного массива
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        Arrays.sort(temp_nums); //сортировака копии массива
        min = temp_nums[0];
        for (int i=0,j=0;i<nums.length;i++)
        {
            j = nums[i];
            if (j==min)
            {
                count++;
                if (count==1)
                {
                    System.out.println("Минимальный элемент массива ["+i+"] = "+j);
                }
                else
                {
                    found = true;
                    str += String.valueOf(i)+",";
                }
            }
        }
        if (found)
        {
            str = str+"\b";
            System.out.println("Индексы элементов массива, равных минимальному: ["+str+"]");
        }
    }
}
