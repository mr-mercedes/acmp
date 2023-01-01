import java.util.Scanner;

public class acmp33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int garry = sc.nextInt();
        int larry = sc.nextInt();
        int allTins = garry + larry - 1;
        System.out.println((larry - 1) + " " + (garry - 1));
    }
}
