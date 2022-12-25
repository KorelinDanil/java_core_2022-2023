package lr5;
public class Example6 {
    public static void main(String[] args) {
        Sec_class sec1 = new Sec_class(2, 5);
        sec1.PrintInt();
        Sec_class sec2= new Sec_class(1);
        sec2.PrintInt();
        sec1.SetInt(3, 15);
        sec1.PrintInt();
        sec1.SetInt(-9);
        sec1.PrintInt();
    }
    static class Sec_class {
        private static int min;
        private static int max;
        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }
        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
        Sec_class(int num1, int num2) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }
        Sec_class(int num) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
