import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] N = new int[T];

        for (int i = 0; i < T; i++) {
            N[i] = sc.nextInt();
        }

        Arrays.sort(N);

        for (int num = 0; num < N.length; num++) {
            System.out.println(N[num]);
        }
    }
}