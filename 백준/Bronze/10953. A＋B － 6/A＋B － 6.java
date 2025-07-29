import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i <T; i++) {
            String str = sc.next();

            String[] parts = str.split(",");

            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);

            int sum = num1 + num2;

            System.out.println(sum);
        }
    }
}