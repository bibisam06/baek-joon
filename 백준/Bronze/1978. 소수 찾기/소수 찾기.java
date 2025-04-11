import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int totalcount = 0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(issosu(a)) {
                totalcount++;
            }
        }

        System.out.println(totalcount);
    }

    public static boolean issosu(int a) {

        if(a < 2) return false;

        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) return false;
        }

        return true;
    }
}
