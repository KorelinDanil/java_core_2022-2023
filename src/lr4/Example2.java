package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 15;
        int x = 0;
        for (int i = 1; i <= height; i++) {
            System.out.print(" ");
            for (int j = 0; j <= x; j++) {
                System.out.print("+");
            }
            x = x + 1;
            System.out.println(" ");
        }
    }
}
