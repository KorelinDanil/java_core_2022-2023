package lr3;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели(с заглавной буквы):");
        int num=0;
        boolean check = true;
        String day = in.nextLine();
        switch (day)
        {
            case "Понедельник": {
                num = 1;
                break;
            }
            case "Вторник": {
                num = 2;
                break;
            }
            case "Среда":{
                num = 3;
                break;
            }
            case "Четверг": {
                num = 4;
                break;
            }
            case "Пятница": {
                num = 5;
                break;
            }
            case "Суббота": {
                num = 6;
                break;
            }
            case "Воскресенье": {
                num = 7;
                break;
            }
            default: {
                check = false;
                break;
            }
        }
        if (check==true)
        {
            System.out.printf("День недели: %d ",num);
        }
        else
        {
            System.out.print("Введены неккортектные данные");
        }
        in.close();
    }
}
