import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            int input3 = sc.nextInt();

            if (input1 == 0 && input2 == 0 && input3 == 0) {
                break;
            }

            if (Math.pow(input1,2) + Math.pow(input2,2) == Math.pow(input3,2)) {
                System.out.println("right");
            } else if (Math.pow(input2,2) + Math.pow(input3,2) == Math.pow(input1,2)) {
                System.out.println("right");
            } else if (Math.pow(input3,2) + Math.pow(input1,2) == Math.pow(input2,2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}