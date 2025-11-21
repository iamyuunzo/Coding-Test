import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}