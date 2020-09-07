package 贝壳;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    scanner.nextInt();
                }

            }
            long pre = N;
            for (int j = 1; j < N; j++) {
                pre *= (M - K);
                if (pre >= 1000000007) {
                    pre = pre % 1000000007;
                }
            }
            System.out.println(pre);
        }

    }

}

