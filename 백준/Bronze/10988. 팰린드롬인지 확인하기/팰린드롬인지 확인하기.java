import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(isPallidrome(s)) System.out.println("1");
        else System.out.println("0");
    }

    public static boolean isPallidrome(String s) {
        String lower = s.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();

        if(lower.equals(reversed)) return true;
        else return false;

    }
}
