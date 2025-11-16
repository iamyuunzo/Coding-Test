import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 1; j <= M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            int start = I - 1;
            int end = J - 1;

            while (start < end) {
                int tmp;
                tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                
                start++;
                end--;
            }
        }

        for (int l = 0; l < arr.length; l++) {
            int last = arr[l];
            System.out.print(last + " ");
        }
    }
}