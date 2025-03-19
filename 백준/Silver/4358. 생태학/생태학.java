import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<String> pq = new PriorityQueue<>();
        HashMap<String, Integer> map = new HashMap<>();
        String input;

        double total = 0;
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                break;
            }


            pq.add(input);
            total++;
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        // calculation
        StringBuilder sb = new StringBuilder();
        String prev = "";

        while (!pq.isEmpty()) {
            String tree = pq.poll();

            if (tree == null || tree.equals(prev)) continue;
            prev = tree;

            double sum = (map.get(tree) / total) * 100;
            sb.append(String.format("%s %.4f\n", tree, sum));
        }

        System.out.print(sb);
    }
}