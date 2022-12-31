import java.util.Arrays;
import java.util.Scanner;

public class acmp942 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tasks = sc.nextInt();
        int[] time = new int[tasks];
        for (int i = 0; i < tasks; i++) {
            time[i] = sc.nextInt();
        }
        int fifthCours = 0;
        int therdCours = 0;
        for (int i = 0; i < tasks; i++) {
            fifthCours += time[i] * (tasks - i);
            therdCours += time[tasks - i - 1] * (tasks- i);
        }
        Arrays.sort(time);
        int firstCours = 0;
        for (int i = 0; i < tasks; i++) {
            firstCours += time[i] * (tasks - i);
        }
        result(fifthCours, therdCours, firstCours);
    }

    private static void result(int fifthCours, int therdCours, int firstCours) {
        if (firstCours <= Math.min(fifthCours, therdCours)){
            System.out.println(1);
        } else if (therdCours <= fifthCours) {
            System.out.println(3);
        } else System.out.println(5);
    }
}
