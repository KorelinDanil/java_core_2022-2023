package lr5;
public class Example2 {
    public static void main(String[] args) {
        Literal lit = new Literal();
        lit.SetCh('A', 'W');
        lit.showCharArray();
    }
   static class Literal {
        private char ch1;
        private char ch2;

        public void SetCh(char ch1, char ch2) {
            this.ch1 = ch1;
            this.ch2 = ch2;
        }
        public void showCharArray() {
            int int1 = ch1;
            int int2 = ch2;
            if (ch1 > ch2) {
                int1 = ch2;
                int2 = ch1;
            }
            int schet = 1;
            for (int i = int1; i <= int2; i++) {
                System.out.println(schet + " Символ = " + (char) i);
                schet++;
            }
        }

    }
}
