import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int a = sc.nextInt();
        int[] arr = new int[6];

        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int p = sc.nextInt();
        int tcount = 0;
        //t - shirt
        for(int i = 0; i < 6; i++){
            int numbers = 0;
            while(numbers < arr[i]){
                numbers += s;
                tcount++;
            }

        }
       
        System.out.println(tcount);
        //pen
        System.out.println((a/p) + " " + (a%p));

    }
}
