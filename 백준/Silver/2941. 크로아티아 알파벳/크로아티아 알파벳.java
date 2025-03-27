import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>(Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="));

        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 2 && input.substring(i, i + 3).equals("dz=")) {
                counter++;
                i += 2; // 3글자를 처리했으므로 다음으로 건너뜀
            }
            else if (i < input.length() - 1 && list.contains(input.substring(i, i + 2))) {

                counter++;
                i++;
            }else {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
