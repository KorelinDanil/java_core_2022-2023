package lr6;

public class Example1 {
    public static void main(String[] args) {
        char[] Mass1 = { 'a', 'b', 'c' };
        char[] Mass2 = { 'd' };
        Example1 A = new Example1('A');
        System.out.println("Вызван конструктор с одним символьным параметром: " +A.ret_c());
        Example1 B = new Example1 ("Строка");
        System.out.println("Вызван конструктор с одним строковым параметром: " +B.ret_txt());

        Example1  C = new Example1 (Mass1);
        System.out.println("Вызван конструктор с массивом из более одного элемента: "+C.ret_txt());
        Example1  D = new Example1 (Mass2);
        System.out.println("Вызван конструктор с массивом из одного элемента: "+D.ret_c());
    }
    private char symb;
    private String txt;
    public Example1(char s)
    {
        symb = s;
    }

    // С одним строковым аргументом:
    public Example1(String t)
    {
        txt = t;
    }

    public Example1(char[] c)
    {
        if (c.length == 1)
            symb = c[0];
        else
        {
            // Формирование строки:
            txt = "";
            for (int k = 0; k < c.length; k++)
            {
                txt += c[k];
            }
        }
    }

    // Возврат символьного поля:
    public char ret_c()
    {
        return symb;
    }

    // Возврат строкового поля:
    public String ret_txt()
    {
        return txt;
    }
}
