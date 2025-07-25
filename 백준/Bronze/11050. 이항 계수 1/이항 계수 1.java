import java.util.Scanner;

public class Main {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int nFact = factorial(N);
        int kFact = factorial(K);
        int nkFact = factorial(N - K); 

        int result = nFact / (kFact * nkFact);

        System.out.println(result);
    }
}
