

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        int count = 0;
        for(int i=0; i<input; i++){
            Set<Character> set = new HashSet<Character>();
            String words = sc.next();
            boolean isgroup = true;
            for(int j=0; j<words.length(); j++){
                char current = words.charAt(j);
                if(j>0 && words.charAt(j-1) == words.charAt(j)){
                    continue;
                }
                if (set.contains(current)) {
                    isgroup = false;
                    break;
                }

                set.add(current);
            }
            if(isgroup){
                count++;
            }
        }

        System.out.println(count);

    }
}
