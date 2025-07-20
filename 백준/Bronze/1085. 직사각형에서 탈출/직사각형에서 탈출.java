import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int right = w - x;
        int top = h - y;
        int min = x;

        if (right < min) {
            min = right;
        }
        if (y < min) {
            min = y;
        }
        if (top < min) {
            min = top;
        }
        System.out.println(min);
    }
}