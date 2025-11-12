import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        // 가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
        int A = sc.nextInt();
        int B = sc.nextInt();
        
		// A가 이기면 A, B가 이기면 B를 출력한다. (비기는건 없음)
        // 가위(1) : 보(3)를 내야 이김
        // 바위(2) : 가위(1)를 내야 이김
        // 보(3) : 바위(2)를 내야 이김
        if ( A == 1 && B == 3 ) {
            System.out.print("A");
        } else if ( A == 2 && B == 1 ) {
            System.out.print("A");
        } else if ( A == 3 && B == 2 ) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
	}
}