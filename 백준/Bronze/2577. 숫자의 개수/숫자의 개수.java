import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num = A * B * C;
        String num2 = String.valueOf(num);

        int [] number = new int[10];

        for (int j = 0; j < num2.length(); j++) {
            char ch = num2.charAt(j);
            int digit = ch - '0';
            number[digit]++;
        }

        for (int k = 0; k < 10; k++) {
            System.out.println(number[k]);
        }
    }
}