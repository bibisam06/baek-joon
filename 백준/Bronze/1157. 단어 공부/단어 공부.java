import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lower = input.toLowerCase();
        int[] alphabets = new int[26];
        char[] chars = lower.toCharArray();

        for(char c : chars){
            int index = c - 'a';

            alphabets[index]++;
        }
        int max = alphabets[0];
        int maxindex = 0;
        int counter = 0;
        for (int i = 1; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                maxindex = i;
            }
        }

        for(int num : alphabets){
            if(num == max){
                counter++;
            }
        }

        if (counter > 1) {
            System.out.println("?");
        }else{
            char ch = (char) ('A' + maxindex);
            System.out.println(ch);
        }


    }
}