import java.util.Scanner;

public class B1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vect[] = new int[20];

        for(int i = vect.length-1; i >= 0; i--) {
          vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("N[%d] = %d\n",i ,vect[i]);
        }
        sc.close();
    }
}
