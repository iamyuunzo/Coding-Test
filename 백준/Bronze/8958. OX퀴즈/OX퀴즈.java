import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {
            String str = sc.nextLine();

            int score = 0;
            int plus = 0;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == 'O') {
                    plus++;
                    score += plus;
                } else {
                    plus = 0;
                }
            }
            System.out.println(score);
        }
    }
}