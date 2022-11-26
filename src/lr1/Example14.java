package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");

        int num = in.nextInt();
        int num_minus = num-1;
        int num_plus  = num+1;
        double value = Math.pow(num_minus+num+num_plus,2);
        int pow = (int)value;

        System.out.printf("%d, %d, %d, %d",num_minus,num,num_plus,pow);
        in.close();
    }
}
