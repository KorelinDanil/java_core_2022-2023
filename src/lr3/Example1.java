package lr3;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = in.nextInt();
        boolean check = true;
        String day = null;
        switch (num)
        {
            case 1: {
                day ="Понедельник";
                break;
            }
            case 2: {
                day = "Втроник";
                break;
            }
            case 3:{
                day = "Среда";
                break;
            }
            case 4: {
                day = "Четверг";
                break;
            }
            case 5: {
                day = "Пятница";
                break;
            }
            case 6: {
                day = "Суббота";
                break;
            }
            case 7: {
                day = "Воскресенье";
                break;
            }
            default: {
                check = false;
                break;
            }
        }
        if (check==true)
        {
            System.out.printf("День недели: %s ",day);
        }
        else
        {
            System.out.print("Введены неккортектные данные");
        }
        in.close();
    }
}
