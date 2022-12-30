import java.util.Scanner;

public class acmp008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arr = new long[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }

        if (arr[0] * arr[1] == arr[2]){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}