
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FCombos {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("flavor.dat"));
        int z = s.nextInt();
        for (int i = 0; i < z; i++) {
            int a = s.nextInt();
            int[] vals = new int[5];
            for (int j = 0; j < a; j++) {
                vals[s.nextInt()-1] += s.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 5; j++) {
                if(min > vals[j]) {
                    min = vals[j];
                }
            }
            System.out.println(min);
        }
    }
}
