import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] num = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int j = 0; j < N; j++) {
            int x = num[j];
            
            if (x == 1) continue;
            
            boolean isPrime = true;
            
            for (int k = 2; k * k <= x; k++) {
                if (x % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}