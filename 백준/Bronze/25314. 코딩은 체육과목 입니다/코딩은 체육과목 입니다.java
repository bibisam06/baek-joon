import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String string1 = "long int";

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        if(in<=4){
            System.out.println(string1);
        }
        else{
            int a2 = in - 4;
            for(int i = 0; i<a2/4; i++){
                System.out.print("long" + " ");
            }
            System.out.print(string1);
        }
    }
}
