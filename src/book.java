
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
public class book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("book.dat"));
        int sets = Integer.parseInt(keyb.nextLine());
        for (int i = 0; i < sets; i++) {
            String s = keyb.nextLine().trim();
            if (Character.isUpperCase(s.charAt(0))) {
                System.out.println(s.substring(0, s.length() - 3));
            } else {
                s = s.substring(0, s.length() - 2);
                for (int j = 1; j < s.length(); j++) {
                    if (Character.isUpperCase(s.charAt(j))) {
                        System.out.println(s.substring(j) + s.substring(0,j));
                        break;
                    }

                }

            }
        }

    }

}
