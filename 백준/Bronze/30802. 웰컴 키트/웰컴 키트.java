import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long[] tshirts = new long[6];
        for (int i = 0; i < 6; i++) {
            tshirts[i] = sc.nextLong();
        }

        long T = sc.nextLong();
        long P = sc.nextLong();

        long tshirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            tshirtBundles += (tshirts[i] + T - 1) / T;
        }
        System.out.println(tshirtBundles);

        long penBundles = N / P;
        long penSingle = N % P;
        System.out.println(penBundles + " " + penSingle);
    }
}
