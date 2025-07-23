import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sd = sc.nextInt();
        int jd = sc.nextInt();
        int hd = sc.nextInt();
        int coke = sc.nextInt();
        int cider = sc.nextInt();

        int setBurger = Math.min(sd, Math.min(jd, hd));
        int setDrink = Math.min(coke, cider);

        int setPrice = setBurger + setDrink - 50;
        System.out.println(setPrice);

    }
}