package lr6;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        char[] arr = { 'h', 'e', 'l', 'l', 'o', '!' };
       Arrays.sort(arr);
        for(char ch : arr)
            System.out.println(ch + " ");
    }
    static void Sort(char[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
