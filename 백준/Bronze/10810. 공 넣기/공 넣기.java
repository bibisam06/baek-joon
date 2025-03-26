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

        for (int j = 0; j < m; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            int a1 = Integer.parseInt(st2.nextToken()) - 1;
            int b1 = Integer.parseInt(st2.nextToken()) - 1;
            int c1 = Integer.parseInt(st2.nextToken());

            for (int i = a1; i <= b1; i++) {
                arrays[i] = c1;
            }
        }

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
