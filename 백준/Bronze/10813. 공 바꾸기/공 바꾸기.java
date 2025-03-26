import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 공을 넣는 횟수

        int[] arrays = new int[n];

        // 초기화 (바구니 번호는 1부터 시작)
        for (int i = 0; i < n; i++) {
            arrays[i] = i + 1;
        }

        // 공을 바꾸는 작업
        for (int j = 0; j < m; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a1 = Integer.parseInt(st2.nextToken()) - 1; // 인덱스는 0부터 시작
            int b1 = Integer.parseInt(st2.nextToken()) - 1; // 인덱스는 0부터 시작

            // 스왑 로직
            int tmp = arrays[a1];
            arrays[a1] = arrays[b1];
            arrays[b1] = tmp;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arrays[i]);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
