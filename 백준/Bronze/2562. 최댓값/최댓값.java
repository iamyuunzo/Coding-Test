import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;     
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int N = sc.nextInt();   

            max = Math.max(max, N);

            if (max == N) {
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}