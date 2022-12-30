import java.util.Scanner;

public class acmp013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String x = numbers[0];
        String y = numbers[1];
        int cow = 0;
        int bull = 0;
        if (x.length() == y.length()) {
            for (int i = 0; i < x.length(); i++) {
                for (int j = 0; j < y.length(); j++) {
                    if (x.charAt(i) == y.charAt(j) && i != j){
                        cow++;
                    }
                }
                if (x.charAt(i) == y.charAt(i)){
                    bull++;
                }
            }
        }
        System.out.println(bull + " " + cow);
    }
}
