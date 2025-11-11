import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int sum = 0;
        
        while (a > 0) {
            int b = a % 10;
            a /= 10;
            sum += b;
        }
        System.out.print(sum);
	}
}