package lr3;
import java.util.Arrays;
public class Example7 {
    public static void main(String[] args) {
        int size =10;
        int x=0;
        char[] array = new char[size];
        System.out.println("Прямой порядок:");
        for (char i = 'a'; i<'z'; i= (char)(i+2))
        {
            if (x<array.length)
            {
                array[x] = i;

                System.out.println("Элемент массива ["+x+"] = "+array[x]);
            }
            else
            {
                System.out.println("Обратный порядок:");
                for(int j= 9;j>=0;j--)
                {
                    x--;
                    System.out.println("Элемент массива ["+j+"] = "+array[x]);

                }
                break;
            }
            x++;
        }
    }
}
