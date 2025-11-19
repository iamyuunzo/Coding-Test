import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            set.add(M);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}