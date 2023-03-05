package lr6;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Двойной факториал числа (рекурсия)");
        System.out.println(Fact1(6));
        System.out.println("Двойной факториал числа (цикл)");
        System.out.println(Fact1(6));
    }
    static int Fact2(int n)
    {
        int result = 1;
        for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2)
            result *= i;

        return result;
    }
    static int Fact1(int n)
    {
        if (n <= 1)
            return 1;
        else
            return n * Fact1(n - 2);
    }
}
