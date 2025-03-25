import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arrays = sc.next().toCharArray();

        char[][] alphabet = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'},
                {'M', 'N', 'O'},
                {'P', 'Q', 'R', 'S'},
                {'T', 'U', 'V'},
                {'W', 'X', 'Y', 'Z'}
        };

        int total = 0;
        int index = 0;
        for(char c : arrays){

            for(int i = 0; i < alphabet.length; i++){
                for(int j = 0; j < alphabet[i].length; j++) {

                    if(c==alphabet[i][j]){
                        total += (i+3);
                    }
                }
            }

        }

        System.out.println(total);
    }
}
