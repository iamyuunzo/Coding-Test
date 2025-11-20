import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int [] arr = {2, 3, 5, 7, 11};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int [] count = new int[5];
            int N = sc.nextInt();
            
            for (int i = 0; i < count.length; i++) {
          
                while (N % arr[i] == 0) {
                    N /= arr[i];
                    count[i]++;
                }
            }
            
            System.out.print("#" + test_case + " ");
            
            for (int j = 0; j < count.length; j++) {
            	System.out.print(count[j] + " ");
            }
            
            System.out.println();
		}
	}
}