import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = sc.next();
            int age = sc.nextInt();
            int kg = sc.nextInt();

            if (name.equals("#") && age == 0 && kg == 0) {
                break;
            }

            if (age>17 || kg >= 80) {
                System.out.printf("%s Senior\n", name);
            } else {
                System.out.printf("%s Junior\n", name);
            }
        }
    }
}