package lr4;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите ширину прямоугольника: ");
        int width = id.nextInt();
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][width];
        for (int i =0; i < height; i++){
            for (int j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print(" ");
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
