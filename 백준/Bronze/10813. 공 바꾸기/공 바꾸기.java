import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] basket = new int[N];
        
        for (int num1 = 0; num1 < N; num1++) {
            basket[num1] = num1 + 1;
        }

        for (int num2 = 1; num2 <= M; num2++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp;
            tmp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tmp;
        }

        for (int num3 = 0; num3 < N; num3++) {
            int a = basket[num3];
            System.out.print(a + " ");
        }
    }
}