import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result = "";
        int i;
        
        for(i=1; i<=n; i++) {
            result += str;
        }
        
        System.out.print(result);
    }
}