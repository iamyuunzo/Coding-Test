import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        int num = 0;
		
        for (int i = 0; i < str.length(); i++) {
            num = str.charAt(i) - 'A' + 1;
            System.out.print(num + " ");
        }
	}
}