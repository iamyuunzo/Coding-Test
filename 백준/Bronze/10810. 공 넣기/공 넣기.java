import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];

        for (int num = 1; num <= M; num++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int num2 = i; num2 <= j; num2++) {
                arr[num2 - 1] = k;
            }
        }

        for (int num3 = 0; num3 < arr.length; num3++) {
            System.out.print(arr[num3] + " ");
        }
    }
}