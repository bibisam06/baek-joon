import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            char[] array = br.readLine().toCharArray();
            int length = array.length;

            if(length == 1){
                System.out.println(array[0] +"" + array[0]);
            }else if(length == 2){
                System.out.println(array[0] +"" + array[1]);
            }else{
                System.out.println(array[0] +"" + array[length-1]);
            }

        }


    }
}
