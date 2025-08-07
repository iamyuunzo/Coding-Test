import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        String str1 = String.valueOf(X);
        String str2 = String.valueOf(Y);

        String RevX = new StringBuilder(str1).reverse().toString();
        String RevY = new StringBuilder(str2).reverse().toString();

        int RevX2 = Integer.parseInt(RevX);
        int RevY2 = Integer.parseInt(RevY);

        int sum = RevX2 + RevY2;
        String result = String.valueOf(sum);
        String result2 = new StringBuilder(result).reverse().toString();
        int result3 = Integer.parseInt(result2);

        System.out.println(result3);

    }
}