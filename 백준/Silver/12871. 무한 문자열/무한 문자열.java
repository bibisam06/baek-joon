import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i < t.length(); i++) {
            s1.append(s);
        }
        for (int i = 0; i < s.length(); i++) {
            s2.append(t);
        }

        if(s1.compareTo(s2) == 0) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

}
