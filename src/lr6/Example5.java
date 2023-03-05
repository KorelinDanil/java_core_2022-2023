package lr6;
import java.math.MathContext;
public class Example5 {
    public static void main(String[] args) {
        System.out.println("Сумма квадратов натуральных чисел(цикл)");
        System.out.println(foo1(10));
        System.out.println("Сумма квадратов натуральных чисел(рекурсия)");
        System.out.println(foo2(10));
    }
    static int foo1(int n)
    {
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (int)(Math.pow(i, 2));
        return result;
    }
    static int foo2(int n)
    {
        if (n <= 1)
            return n;
        else
            return foo2(n - 1) + n * n;
    }
}
