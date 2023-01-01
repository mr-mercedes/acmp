import java.util.Arrays;
import java.util.Scanner;

public class acmp021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salary = new int[3];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        Arrays.sort(salary);
        System.out.println(salary[salary.length - 1] - salary[0]);
    }
}
