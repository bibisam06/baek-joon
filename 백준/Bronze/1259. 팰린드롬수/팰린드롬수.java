

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            
            if (num == 0) break;

            String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
            if(reversed.equals(String.valueOf(num))){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }



    }
}
