import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int reversed1  = getReversed(a);
        int reversed2  = getReversed(b);

        if(reversed1 > reversed2){
            System.out.println(reversed1);
        }else{
            System.out.println(reversed2);
        }


    }

    public static int getReversed(int a) {

        int baek = a / 100;
        int sip = ( a - (100*baek)) / 10;
        int ill = ( a - (100*baek)) % 10;

        //System.out.println("백의 자릿수 : " + baek + "십의 자리수: " + sip + "일의 자릿수 : " + ill);

        int reversed = ill*100+sip*10+baek;

        return reversed;

    }
}
