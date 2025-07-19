import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int first = sc.nextInt();
        int max = first;
        int min = first;

        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();

            max = Math.max(max, num);
            min = Math.min(min, num);

        }

        System.out.printf("%d %d", min, max);
    }
}