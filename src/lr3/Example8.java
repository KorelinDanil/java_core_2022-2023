package lr3;
import java.util.Arrays;
public class Example8 {
    public static void main(String[] args) {
        char array[] = new char[10];
        int x=0;
        for (char i = 'A';i<'Z';i++)
        {
            if (i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='Y')
            {
                continue;
            }
            else
            {
                if(x< array.length)
                {
                    array[x] = i;
                    System.out.println("Элемент массива ["+x+"] = "+array[x]);
                    x++;
                }
            }
        }
    }
}
