import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        long sqrt = 1;
        long counter = 1234567891;
        long r = 31;

        String s = sc.next();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            int a = c - 'a'+1;
            result = (result + a * sqrt) % counter;
            sqrt = (sqrt * 31) % counter;
        }


        System.out.println(result);

    }
}
