import java.util.Scanner;

public class acmp025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        if (A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else System.out.println("=");
    }
}
