import java.util.ArrayList;
import java.util.Scanner;

public class acmp010
{
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String[] value = src.nextLine().split(" ");
        int a = Integer.parseInt(value[0]);
        int b = Integer.parseInt(value[1]);
        int c = Integer.parseInt(value[2]);
        int d = Integer.parseInt(value[3]);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = -100; i < 101; i++) {
            if ((a * Math.pow(i, 3)) + (b * Math.pow(i, 2)) + (c * i) + d == 0){
                ans.add(i);
            }
        }
        for (Integer item : ans) {
            System.out.print(item + " ");
        }
    }
}