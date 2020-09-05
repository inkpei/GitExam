
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        selectSort(array);
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i; // 将当前下标定义为最小值下标

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) { // 如果有小于当前最小值的关键字, 则将此关键字的下标赋值给min
                    min = j;
                }
            }
            if (i != min) { // 若min不等于i，说明找到最小值，交换
                swap(arr, i, min);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
}
