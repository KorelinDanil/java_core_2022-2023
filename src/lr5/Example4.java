package lr5;
public class Example4 {
    public static void main(String[] args) {
        Sec_class sec_class1 = new Sec_class(12, 'A');
        Sec_class sec_class2 = new Sec_class(65.1267);
    }
    static class Sec_class {
        private char ch1;
        private int int1;

        Sec_class(int i, char c) {
            this.ch1 = c;
            this.int1 = i;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length + "\n");
        }
        Sec_class(double d) {
            char ch1 = (char) d;
            int1 = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
        }
    }
}
