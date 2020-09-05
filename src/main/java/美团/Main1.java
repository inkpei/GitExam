package 美团;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String s = scanner.nextLine();
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 0;
        while (s.charAt(i) != 'M') i++;
        while (s.charAt(i) != 'T') i++;
        int start = i + 1;
        i = s.length() - 1;
        while (s.charAt(i) != 'T') i--;
        while (s.charAt(i) != 'M') i--;
        System.out.println(s.substring(start, i));

    }
}
