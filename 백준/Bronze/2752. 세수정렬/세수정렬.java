import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        System.out.printf("%d %d %d\n", nums[0], nums[1], nums[2]);
    }
}
