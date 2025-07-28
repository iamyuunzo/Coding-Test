import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        int sum = N1 + N2 + N3;

        if (N1 == 60 && N2 == 60 && N3 == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180 && (N1 == N2 || N2 == N3 || N1 == N3)) {
            System.out.println("Isosceles");
        } else if (sum == 180) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}