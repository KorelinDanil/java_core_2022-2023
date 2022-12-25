package lr5;
public class Example5 {
    public static void main(String[] args) {
        Sec_class sec = new Sec_class(21);
        System.out.println("Число = " + sec.PrintInt());
        
        sec.Set(15);
        System.out.println("Число = " + sec.PrintInt());
        
        sec.Set(125);
        System.out.println("Число = " + sec.PrintInt());
        
        sec.Set(-15);
        System.out.println("Число = " + sec.PrintInt());
        
        sec.Set();
        System.out.println("Число = " + sec.PrintInt());
    }
    static class Sec_class {
        private int int1;
        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }
        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }
        public int PrintInt() {
            return int1;
        }
        Sec_class(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}
