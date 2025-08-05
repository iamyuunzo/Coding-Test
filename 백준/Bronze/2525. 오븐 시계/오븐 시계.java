import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] AB = new int[2];

        for (int i = 0; i < 2; i++) {
            AB[i] = sc.nextInt();
        }

        int C = sc.nextInt();

        int sum = AB[1] + C;
        int hour = AB[0] + (sum / 60);
        int minute = sum % 60;

        if (sum < 60) {
            System.out.printf("%d %d", AB[0], sum);
        } else {
            AB[0] = hour % 24;
            System.out.printf("%d %d", AB[0], minute);
        }
    }
}