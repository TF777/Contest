
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tip {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("tip.dat"));
        int sets = Integer.parseInt(keyb.nextLine());
        for (int im = 0; im < sets; im++) {
            String[] in = keyb.nextLine().split(" ");
            double d = Double.parseDouble(in[1]);
            switch(in[0]){
                case "1":
                    System.out.printf("$%.2f\n",d);
                    break;
                case "2":
                    System.out.printf("$%.2f\n",d + d*.08);
                    break;
                case "3":
                    System.out.printf("$%.2f\n",d + d*.12);
                    break;
                case "4":
                    System.out.printf("$%.2f\n",d + d*.15);
                    break;
                case "5":
                    System.out.printf("$%.2f\n",d + d*.20);
                    break;
            }
            
        }

    }

}
