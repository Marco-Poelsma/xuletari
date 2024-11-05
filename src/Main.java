import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
//        String[] jijiji = scan.nextLine().split(" ");
//        jijiji[0] =  (Integer.parseInt(jijiji[1]) + Integer.parseInt(jijiji[2]));
        int posicionsArray = scan.nextInt();
        int[][] matriu = new int [posicionsArray][posicionsArray];
        for (int i = 0; i < posicionsArray; i++) {
            for (int j = 0; j < posicionsArray; j++) {
                matriu[i][j] = scan.nextInt();
            }
        }
        System.out.println(matriu.length);
        for (int i = 0; i < posicionsArray; i++) {{
                System.out.println(Arrays.toString(matriu[i]));
            }
        }
//        System.out.println(jijiji.length);
//        System.out.println(Arrays.toString(jijiji));
    }
}