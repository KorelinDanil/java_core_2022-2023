package lr5;
public class Example1 {
    public static void main(String[] args) {
        liter lit = new liter();
        lit.set('B');
        System.out.println("Char code = " + lit.getCodeSymbol()+"\n");
        lit.viewCode();

    }
    static class liter{
        private char ch;

        public void set(char new_ch){
            this.ch = new_ch;
        }

        public int getCodeSymbol() {
            return (int) ch;
        }
        public void viewCode() {
            System.out.println("new_ch = " + ch);
            System.out.println("new_ch = " + getCodeSymbol()+"\n");
        }
    }
}
