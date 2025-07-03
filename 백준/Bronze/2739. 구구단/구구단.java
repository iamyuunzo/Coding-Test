import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N;
        N = sc.nextInt();

        for (i=1; i<10; i++) {
            System.out.print(N);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(N*i);
        }
    }
}