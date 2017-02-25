
import java.io.FileNotFoundException;


public class DryRun {

    public static void main(String[] args) throws FileNotFoundException {
        int a =0;
        String f = "apluscompsci.com";
        for (int i = 0; i < f.length(); i++) {
            if((f.charAt(i) + "").matches("[^compsci]")){
                a++;
            }
            
        }
        System.out.println(a);
    }
}
