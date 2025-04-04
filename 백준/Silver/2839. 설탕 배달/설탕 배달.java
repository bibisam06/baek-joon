

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] sugars = {5, 3};
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        while (N % 5 != 0 && N >= 0) {
            N -= 3;
            count++;
        }


        if (N < 0) {
            System.out.println(-1);
        } else {
            count += N / 5;
            System.out.println(count);
        }

    }
}
