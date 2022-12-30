import java.util.Scanner;

public class acmp009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        long[] arr = new long[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }
        long sumPositive = sum(arr);
        long comp = composition(arr);
        System.out.print(sumPositive + " " + comp);
    }

    private static long composition(long[] arr) {
        int minIndex = 0;
        long min = arr[minIndex];
        int maxIndex = 0;
        long max = arr[maxIndex];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            } else {
                if (arr[i] > max){
                    max = arr[i];
                    maxIndex = i;
                }
            }
        }
        return func(arr, minIndex, maxIndex);
    }

    private static long func(long[] arr, int minIndex, int maxIndex) {
        long comp = 1;
        for (int i = Integer.min(minIndex, maxIndex) + 1; i < Integer.max(minIndex, maxIndex); i++) {
            comp *= arr[i];
        }
        return comp;
    }

    private static long sum(long[] arr) {
        long sum = 0;
        for (long l : arr) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }
}
