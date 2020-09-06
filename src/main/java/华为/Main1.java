package 华为;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals(""))break;
            list.add(s);
        }
        int k = Integer.parseInt(list.get(list.size() - 2));
        String subString = get(list.get(list.size() - 1), k);
        for (int i = 0; i < list.size() - 2; i++) {
            String tmp = get(list.get(i), k);
            if (subString.contains(tmp)) {
                System.out.println(list.get(i));
            }
        }

    }

    static String get(String s, int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' < k) {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}

/*

135682318
23457
14282123
14231728
3
1724153

 */
