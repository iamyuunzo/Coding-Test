import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        for (int i = 2; i >= 0; i--) {
            int c = b.charAt(i) - '0';
            System.out.println(a * c);
        }
        System.out.println(a * Integer.parseInt(b));
    }
}