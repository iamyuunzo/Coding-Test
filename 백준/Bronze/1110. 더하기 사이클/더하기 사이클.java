import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_N = sc.nextInt();
        int last_N = first_N;
        int count = 0;

        do {
            int a = last_N / 10;
            int b = last_N % 10;

            int sum = a + b;
            last_N = (b * 10) + (sum % 10);

            count++;
        } while (first_N != last_N);

        System.out.print(count);
    }
}