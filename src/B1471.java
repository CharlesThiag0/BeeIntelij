import java.util.Scanner;

public class B1471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       do {
            int matriz[][] = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    if(i == j) {
                      matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = Math.abs(i - j) + 1;
                    }

                }
           }

           for(int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                   System.out.print(matriz[i][j] + " ");
               }
               System.out.println();
           }

           n = sc.nextInt();
        } while(n != 0);
        sc.close();
    }
}
