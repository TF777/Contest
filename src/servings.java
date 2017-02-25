
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
public class servings {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("servings.dat"));
        int t = Integer.parseInt(keyb.nextLine());
        for (int i = 0; i < t; i++) {
//            double r = Double.parseDouble(keyb.nextLine());
//            r = r / Math.PI * 8/2; //get out of my house ryan alford
//            System.out.printf("%.2f\n", r);
            keyb.nextLine();
            String[] x = keyb.nextLine().split(" ");
            String[] y = keyb.nextLine().split(" ");
            int m = Integer.MAX_VALUE;
            for (int j = 0; j < x.length; j++) {
                if(!y[j].equals("0") && Integer.parseInt(x[j])/Integer.parseInt(y[j]) < m)
                    m = Integer.parseInt(x[j])/Integer.parseInt(y[j]);
            }
            System.out.println(m);
            
        }
    }
}
