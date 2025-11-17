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
			String date = sc.next();
            
            String year = date.substring(0, 4);
            String month1 = date.substring(4, 6);
            String day1 = date.substring(6);
            
            String correct_date = year + "/" + month1 + "/" + day1;
           
            int month2 = Integer.parseInt(month1);
            int day2 = Integer.parseInt(day1);
            int [] day_arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
            if (month2 == 0 || month2 > 12) {
                System.out.println("#" + test_case + " " + "-1");
            } else if (day2 > day_arr[month2]){
                System.out.println("#" + test_case + " " + "-1");
            } else {
                System.out.println("#" + test_case + " " + correct_date);
            }
		}
	}
}