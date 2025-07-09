import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String M = sc.next();

        int sum = 0;

        for (int i=0; i<N; i++) {
            char digit = M.charAt(i);
            int num = digit - '0';
            sum += num;
        }

        System.out.print(sum);
    }
}