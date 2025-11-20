import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int sum = 1;
			int N = sc.nextInt();
			int [] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = i + 1;
			}
            
            for (int j = 0; j < N-1; j++) {
                if (arr[j+1] % 2 == 0) {
                	sum -= arr[j+1];
                } else {
                	sum += arr[j+1];
                }
			}
            System.out.println("#" + test_case + " " + sum);
		}
    }
}