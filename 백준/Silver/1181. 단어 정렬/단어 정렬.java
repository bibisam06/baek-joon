import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());


        Set<String> treeset = new TreeSet<>((a,b) ->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        
        for(int i=0; i<a1; i++) {
            treeset.add(String.valueOf(br.readLine()));
        }


        for(String s : treeset) {

            System.out.println(String.valueOf(s));
        }

    }
}
