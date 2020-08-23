import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        arr.remove(k - 1);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size()) {
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
