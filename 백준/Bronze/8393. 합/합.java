import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, k, n;
        k=0;
        n = sc.nextInt();

        for (i=1; i<=n; i++) {
            k += i;
        }

        System.out.println(k);
    }
}