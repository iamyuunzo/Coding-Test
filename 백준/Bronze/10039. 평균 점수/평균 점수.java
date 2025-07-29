import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (int i=0; i<5; i++) {
            int student = sc.nextInt();

            if (student < 40) {
                score += 40;
            } else {
                score += student;
            }
        }
        System.out.println(score/5);
    }
}