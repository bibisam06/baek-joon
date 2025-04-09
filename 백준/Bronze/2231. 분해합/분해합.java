
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();

       for( int i=1; i<=N; i++){
            if((i+calculatesum(i)) == N){
                System.out.println(i);
                break;
            }
           if(i == N){
               System.out.println(0);
           }

       }



    }

    public static int calculatesum(int num){
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
