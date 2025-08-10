import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] time = new int[2];

        for (int i = 0; i < 2; i++) {
            time[i] = sc.nextInt();
        }

        int hour = time[0];
        int minute = time[1];

        if (minute < 45) {        
            minute += 60 - 45; 
            hour = (hour == 0) ? 23 : hour - 1;
        } else { 
            minute -= 45;
        }

        System.out.printf("%d %d", hour, minute);
    }
}