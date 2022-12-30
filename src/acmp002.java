import java.util.Scanner;

public class acmp002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long sum = 0;
        if (number > 0){
            sum = number * (1 + number) / 2;
        } else {
            sum = -number * (number - 1) / 2 + 1;
        }
        System.out.println(sum);
    }
}
