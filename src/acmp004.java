import java.util.Scanner;

public class acmp004 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int secondNumber = 9;
        int result = secondNumber - number;
        String str = String.valueOf(number) + secondNumber + result;
        System.out.println(str);
    }
}