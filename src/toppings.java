
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class toppings {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("toppings.dat"));
        int sets = Integer.parseInt(keyb.nextLine());
        for (int im = 0; im < sets; im++) {
            int t = Integer.parseInt(keyb.nextLine());
            int c = 0;
            String[] p = keyb.nextLine().split(" ");
            int[] p2 = new int[p.length];
            for (int i = 0; i < p2.length; i++) {
                p2[i] = Integer.parseInt(p[i]);
            }
            Arrays.sort(p2);

            int lcm = p2[p2.length - 1];
            boolean bob = true;
            while(bob){
            for (int i = 0; i < p2.length; i++) {
                while (lcm % p2[i] != 0) {
                    lcm += p2[p2.length - 1];
                }
                bob = false;
                for (int j = 0; j < p2.length; j++) {
                    if(lcm % p2[j] != 0){
                        bob = true;
                    }
                }
            }
            }

            int tot = 0;
            for (int i = 0; i < p2.length; i++) {
                tot+=lcm/p2[i];
            }
            System.out.println(tot);
        }

    }

}
