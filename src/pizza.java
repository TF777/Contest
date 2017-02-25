
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class pizza {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("pizza.dat"));
        int sets = Integer.parseInt(keyb.nextLine());
        for (int im = 0; im < sets; im++) {
            String[] st = keyb.nextLine().split(" ");
            int t = Integer.parseInt(st[0]);
            double cost = Double.parseDouble(st[1]) - 10.00;
            int par = (int) (cost / .5);
            BigInteger tot = BigInteger.ONE;

            int levels = Math.min(par, t);int val = 0;
            for (int i = 1; i <= levels; i++) {
                
              
                    val += t - i;
                
                
                
            }
tot = tot.add(BigInteger.valueOf(val));
            System.out.println(tot.mod(BigInteger.valueOf(9001)));
        }

    }

    private static BigInteger factorial(int x) {
        BigInteger b = BigInteger.ONE;
        while (x > 0) {
            b = b.multiply(BigInteger.valueOf(x--));
        }
        return b;
    }

}
