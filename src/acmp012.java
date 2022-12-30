import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class acmp012 {
    static class Point {
        final long x;
        final long y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

    }
    static long area(Point a, Point b, Point c) {
        return Math.abs((b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x));
    }

    static boolean area2(Point p, Point a, Point b, Point c) {
        return area(a, b, c) == area(p, a, b) + area(p, b, c) + area(p, a, c);
    }

    static ArrayList<String> reader(String fileName){
        ArrayList<String> str = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName);
             Scanner sc = new Scanner(fr)){
            while (sc.hasNextLine()){
                str.add(sc.nextLine());
            }
        } catch (IOException e){
            throw new RuntimeException("Error", e);
        }
        return str;
    }


    public static void main(String[] args) {
        String fileName = "input.txt";
        ArrayList<String> var = reader(fileName);
        int count = 0;
        int n = Integer.parseInt(var.get(0));
        for (int i = 1; i <= n; i++) {
            String[] parse = var.get(i).split(" ");
            Point p = new Point(Long.parseLong(parse[0]), Long.parseLong(parse[1]));
            Point a = new Point(Long.parseLong(parse[2]), Long.parseLong(parse[3]));
            Point b = new Point(Long.parseLong(parse[4]), Long.parseLong(parse[5]));
            Point c = new Point(Long.parseLong(parse[6]), Long.parseLong(parse[7]));
            Point d = new Point(Long.parseLong(parse[8]), Long.parseLong(parse[9]));


            if (area2(p, a, b, c) || area2(p, a, c, d)) {
                count++;
            }
        }
        System.out.println(count);
    }
}