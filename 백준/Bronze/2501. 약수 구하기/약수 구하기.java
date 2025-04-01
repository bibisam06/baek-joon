

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] ints = new int[a];

        int j=0;
        for(int i = 1; i <= a; i++){

            if(a%i == 0){
                ints[j] = i;
                j++;
            }
        }
        
        System.out.println(ints[b-1]);

    }
}
