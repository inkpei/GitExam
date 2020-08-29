package meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String s = scanner.nextLine();
        ArrayList<Integer> M = new ArrayList<>();
        ArrayList<Integer> T = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                M.add(i);
            }
            if (s.charAt(i) == 'T') {
                T.add(i);
            }
        }
        int start = 0;
        for (int i = 0; i < T.size(); i++) {
            if (T.get(i) > M.get(0)) {
                start = T.get(i) + 1;
                break;
            }
        }
        int end = s.length();
        for (int i = M.size() - 1; i >= 0; i++) {
            if (M.get(i) < T.get(T.size() - 1)) {
                end = M.get(i);
                break;
            }
        }

        System.out.println(s.substring(start, end));
    }
}
