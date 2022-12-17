package lr4;

public class Example1 {
    public static void main(String[] args) {
        int rows = 11;
        int columns = 23;
        for (int i = 1 ; i <= rows; i++){
            System.out.print(" ");
            for (int j = 1; j <=columns; j++){
                System.out.print("+");
            }
            System.out.println(" ");
        }
    }
}
