import java.util.Scanner;

public class acmp755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(x + y < z ? "Impossible" : String.valueOf(x + y -z));
    }
}
