import java.util.Scanner;

public class acmp014a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int countX = 0;
        int countY = 0;
        int result = 1;
        for (int i = 2; i <= Math.max(x, y); i++) {
            while (x % i == 0 && i <= x){
                x = x / i;
                countX++;
            }
            while (y % i == 0 && i <= y){
                y = y / i;
                countY++;
            }
            if (countX > 0 || countY > 0){
                int count = Math.max(countX, countY);
                result *= Math.pow(i, count);
                countX = 0;
                countY = 0;
            }
        }
        System.out.println(result);
    }
}
