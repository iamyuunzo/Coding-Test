import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String reverse_A = new StringBuilder(A).reverse().toString();
        String reverse_B = new StringBuilder(B).reverse().toString();

        int num1 = Integer.parseInt(reverse_A);
        int num2 = Integer.parseInt(reverse_B);

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
