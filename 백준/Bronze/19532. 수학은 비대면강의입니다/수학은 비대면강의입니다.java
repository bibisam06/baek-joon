//package org.bibisam.bruteforce.Num19532;

import java.util.Scanner;

public class Main {
    static int a, b, c, d, e, f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        int x, y = 0;

        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                if(getsum(i,j)){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static boolean getsum(int x, int y){
        if(a*x + b*y ==c && d*x + e*y == f){
            return true;
        }

        return false;
    }
}
