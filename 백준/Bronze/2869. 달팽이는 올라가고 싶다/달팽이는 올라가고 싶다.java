

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int length = sc.nextInt();
        int counter = (length - down) / (up - down);

        if((length - down) % (up - down) != 0){
            counter++;
        }
        System.out.println(counter);
    }
}
