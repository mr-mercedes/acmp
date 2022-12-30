import java.util.Scanner;

public class acmp014b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int nod = nod(x, y);
        int nok = (x * y)/ nod;
        System.out.println(nok);
    }

    static int nod(int a, int b){
        while (a * b > 0){
            if (a >= b ){
                a = a % b;
            } else b = b % a;
        }
        return a + b;
    }
}
