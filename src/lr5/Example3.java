package lr5;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = in.nextInt();
        System.out.println("Введите num2");
        int int2 = in.nextInt();
        sec_class class1 = new sec_class();
        sec_class class2 = new sec_class(int1);
        sec_class class3 = new sec_class(int1,int2);
    }
    static class sec_class {
        private int num1;
        private int num2;
        sec_class(){
            System.out.println("Koнcтpyиpoвaниe объекта Class(1)\n");
        }
        sec_class(int num1){
            System.out.println("Koнcтpyиpoвaниe объекта Class(2)");
            this.num1 = num1;
            System.out.println("num1^num1 = "+exponentOwnPow (num1)+"\n");
        }
        public int exponentOwnPow (int num1) {
            this.num1 = num1;
            int result=1;
            for (int i=1; i <= num1;i++) {
                result = num1*result;
            }
            return result;
        }
        sec_class(int num1, int num2){
            System.out.println("Koнcтpyиpoвaниe объекта Class(3)");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = "+exponentPow (num1,num2)+"\n");
        }
        public int exponentPow(int n1, int n2){
            n1 = num1;
            n2 = num2;
            int result=1;
            for (int i=1; i <= num2;i++) {
                result = num1*result;
            }
            return result;
        }
    }
}
