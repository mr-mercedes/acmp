import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class acmp001 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("INPUT.TXT"))){
            String str;
            while ((str=br.readLine()) != null) {
                String[] arr = str.split(" ");
                BigInteger numberOne = BigInteger.valueOf(Integer.parseInt(arr[0]));
                BigInteger numberTwo = BigInteger.valueOf(Integer.parseInt(arr[1]));
                BigInteger result = numberOne.add(numberTwo);
                System.out.println(result);
            }

        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
