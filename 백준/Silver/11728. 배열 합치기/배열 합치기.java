import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] A = new int[N];
        int [] B = new int[M];

        for (int i = 0; i < A.length; i++) {
            int A_num = sc.nextInt();
            A[i] = A_num;
        }

        for (int j = 0; j < B.length; j++) {
            int B_num = sc.nextInt();
            B[j] = B_num;
        }

        // 여기서부터 다시 복습하기.. (힌트 받음)
        
        // 현재 위치 (포인터)
        int i = 0;
        int j = 0;

        // 값이 최대 2,000,000개라서 StringBuilder로 모아둔 값 한 번에 출력하기 위해 사용.
        StringBuilder sb = new StringBuilder();

        // A[i] => A에서 지금 가리키는 숫자
        // B[j] => B에서 지금 가리키는 숫자
        
        // A와 B 둘 다 아직 끝까지 읽지 않았을 때만 실행 (둘 중 하나라도 끝나면 비교할 게 없음)
        while (i < N && j < M) {
            // A 현재 값이 B 현재값보다 작거나 같으면 A 숫자가 정답 목록에서 더 앞에 와야 함.
            if (A[i] <= B[j]) {
                sb.append(A[i]).append(' ');
                // 포인터 숫자 up. 다음 숫자를 가리키도록 i 증가
                i++;
            } else {
                // A[i] > B[j]
                sb.append(B[j]).append(' ');
                j++;
            }
        }

        // 남은 값 처리 부분
        // B는 끝났는데 A에 남은 값이 있을 때 그대로 뒤에 이어붙임.
        while (i < N) {
            sb.append(A[i]).append(' ');
            i++;
        }

        while (j < M) {
            sb.append(B[j]).append(' ');
            j++;
        }
        System.out.println(sb);
    }
}