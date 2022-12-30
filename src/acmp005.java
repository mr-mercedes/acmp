import java.util.Scanner;

public class acmp005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] evenArr = new int[even];
        int[] oddArr = new int[odd];
        int countEven = 0;
        int countOdd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenArr[countEven++] = i;
            } else {
                oddArr[countOdd++] = i;
            }
        }
        for (int i : oddArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : evenArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (evenArr.length >= oddArr.length){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
