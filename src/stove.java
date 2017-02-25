
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stove {

    public static final String ugh = " ___ \n"
            + "|   |\n"
            + "|   |\n"
            + "|   |\n"
            + "|___|\n"
            + "     \n"
            + "     \n"
            + "    |\n"
            + "    |\n"
            + "    |\n"
            + "    |\n"
            + "     \n"
            + " \n"
            + "*\n"
            + " \n"
            + " \n"
            + "*\n"
            + "     \n"
            + " ___ \n"
            + "    |\n"
            + " ___|\n"
            + "|    \n"
            + "|___ \n"
            + "\n"
            + " ___ \n"
            + "    |\n"
            + " ___|\n"
            + "    |\n"
            + " ___|\n"
            + "\n"
            + "     \n"
            + "|   |\n"
            + "|___|\n"
            + "    |\n"
            + "    |\n"
            + "\n"
            + " ___ \n"
            + "|    \n"
            + "|___ \n"
            + "    |\n"
            + " ___|\n"
            + "\n"
            + " ___ \n"
            + "|    \n"
            + "|___ \n"
            + "|   |\n"
            + "|___|\n"
            + "\n"
            + " ___ \n"
            + "|   |\n"
            + "    |\n"
            + "    |\n"
            + "    |\n"
            + "\n"
            + " ___ \n"
            + "|   |\n"
            + "|___|\n"
            + "|   |\n"
            + "|___|\n"
            + "\n"
            + " ___ \n"
            + "|   |\n"
            + "|___|\n"
            + "    |\n"
            + "    |"; //lmao

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyb = new Scanner(new File("stove.dat"));
        ArrayList<char[][]> ws = new ArrayList();
        Scanner let = new Scanner(ugh);
        for (int i = 0; i < 11; i++) {
            char[][] l = new char[5][];
            for (int j = 0; j < 5; j++) {
                l[j] = let.nextLine().toCharArray();
            }
            ws.add(l);
            if (i < 10) {
                let.nextLine();
            }
        }

        int sets = Integer.parseInt(keyb.nextLine());
        for (int asdf = 0; asdf < sets; asdf++) {
            char[][] ca = new char[5][25];
            String[] in = keyb.nextLine().split("");
            int index = 0;
            for (int p = 0; p < in.length; p++) {
                char[][] w;
                switch (in[p]) {
                    case "0":
                        w = ws.get(0);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "1":
                        w = ws.get(1);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case ":":
                        w = ws.get(2);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "2":
                        w = ws.get(3);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "3":
                        w = ws.get(4);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "4":
                        w = ws.get(5);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "5":
                        w = ws.get(6);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "6":
                        w = ws.get(7);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "7":
                        w = ws.get(8);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "8":
                        w = ws.get(9);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                    case "9":
                        w = ws.get(10);
                        for (int i = 0; i < w.length; i++) {
                            for (int j = 0; j < w[0].length; j++) {
                                ca[i][index + j] = w[i][j];
                            }
                        }
                        index += w[0].length;
                        break;
                }
                if (index < 25) {
                    for (int i = 0; i < 5; i++) {
                        ca[i][index] = ' ';
                    }
                    index++;
                }
            }

            for (int i = 0; i < ca.length; i++) {
                for (int j = 0; j < ca[i].length; j++) {
                    System.out.print(ca[i][j]);
                }
                System.out.println("");
            }
        }
    }

}
