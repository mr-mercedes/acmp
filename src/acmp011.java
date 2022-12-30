import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class acmp011 {
    public static void main(String[] args) {
        new acmp011().run();
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);
        ) {
            solve(in, out);
        }
    }

    void solve(Scanner in, PrintWriter out) {
        int maxJump = in.nextInt();
        int n = in.nextInt();
        BigInteger count[] = new BigInteger[1 + n];
        count[0] = BigInteger.ONE;
        count[1] = BigInteger.ONE;
        for (int i = 2; i <= maxJump; i++) {
            count[i] = count[i - 1].shiftLeft(1);
        }
        for (int i = maxJump + 1; i <= n; i++) {
            count[i] = count[i - 1].shiftLeft(1).subtract(count[i - 1 - maxJump]);
        }
        out.println(count[n]);
    }
}