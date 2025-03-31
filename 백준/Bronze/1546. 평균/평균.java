import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int input = sc.nextInt();
       double[] arr = new double[input]; //초기화 하기
       for(int i=0; i<input; i++) {
            arr[i] = sc.nextDouble();
       }
       double max = 0, sum = 0;
       for(int i=0; i<input; i++) {
           if(arr[i] > max) {
               max = arr[i];
           }
       }

       for(int i=0; i<input; i++) {
           arr[i] = arr[i] / max * 100;
           sum += arr[i];
       }

       double average = sum / input;

       System.out.println(average);


    }
}
