import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int [] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            arr[i] = score;
        }
        
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k+1]) {
                    int tmp;
                	tmp = arr[k];
                	arr[k] = arr[k+1];
                	arr[k+1] = tmp;
            	}
            }
        }
        int mid = arr.length / 2;
        System.out.print(arr[mid]);
	}
}