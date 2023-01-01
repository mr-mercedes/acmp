import java.util.Scanner;

public class acmp061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < 4; i++) {
            team1 += sc.nextInt();
            team2 += sc.nextInt();
        }
        if (team1 > team2){
            System.out.println(1);
        } else if (team1 < team2) {
            System.out.println(2);
        } else System.out.println("DRAW");
    }
}
