import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getmin(a, b));
        System.out.println(getmax(a, b));

    }

    public static int getmin(int a, int b){
        int c = Math.min(a, b);
        int tmp = 0;
        for(int i=1; i<=c; i++){
            if(a%i==0 && b%i==0){
                tmp = i;
            }
        }
        return tmp;
    }

    public static int getmax(int a, int b){
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        int tmp = 0;
        for(int i=1; i<=c; i++){
            if((c*i) % d == 0){
                tmp = c*i;
                break;
            }
        }
        return tmp;
    }
}
