
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ford.terrell
 */
public class Coupon {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("coupon.dat"));
        int z = s.nextInt();
        for (int i = 0; i < z; i++) {
            int val = 0;
            int sets = s.nextInt();
            for (int j = 0; j < sets; j++) {
                s.nextInt();
                val += 2 * s.nextInt() + 3 * s.nextInt() + s.nextInt();
            }
            System.out.println(val >= 80 ? "coupon" : "full price");//TERRELL FORD EVERYBODY!@@@@@@#$@$^@#$&#%
        }
    }
    
}
