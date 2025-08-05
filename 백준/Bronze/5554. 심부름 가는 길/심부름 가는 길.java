import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toschool = sc.nextInt();
        int topcroom = sc.nextInt();
        int toakademy = sc.nextInt();
        int tohome = sc.nextInt();

        int sum = toschool + topcroom + toakademy + tohome;

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}