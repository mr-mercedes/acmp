import java.util.Scanner;

public class acmp007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        System.out.println(maxNum(maxNum(arr[0], arr[1]), arr[2]));
    }
    public static String maxNum(String one, String two){
        if (one.length() > two.length()) return one;
        if (two.length() > one.length()) return two;
        int cmp = one.compareTo(two);
        if (cmp >= 0){
            return one;
        } else {
            return two;
        }
    }
}
