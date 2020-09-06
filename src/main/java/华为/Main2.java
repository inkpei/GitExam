package 华为;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(";");
        String from = trans(arr[0]);
        String to = trans(arr[1]);
        String[] fromArr = from.split(" ");
        String[] toArr = to.split(" ");



    }

    static String trans(String s) {
        s = s.toLowerCase();
        s = s.replace(",", ".");
        s = s.replace("!", ",");
        s = s.replace(".", " . ");
        s = s.replace("?", " ? ");
        return s.replaceAll(" +", " ");

    }

}
