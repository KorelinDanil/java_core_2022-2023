package lr6;

public class Example2 {
    public static void main(String[] args) {
        StaticMethod.numberIncriment();
    }
    class StaticMethod
    {
        private static int number=1;

        public static int numberIncriment()
        {
            System.out.println(++number);
            return 0;
        }
    }
}
