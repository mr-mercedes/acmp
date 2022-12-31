import java.util.Scanner;

public class acmp766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N * M >= K ? "YES" : "NO");
    }
}
