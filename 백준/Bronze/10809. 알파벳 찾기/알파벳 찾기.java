import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[]a = in.nextLine().toCharArray();
        int[] b = new int[26];

        Arrays.fill(b, -1);
        for(int i=0;i<a.length;i++){
            int index = a[i] - 'a';

            if(b[index]!=-1){
                continue;
            }
            b[index] = i;

        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }


    }
}
