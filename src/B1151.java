import java.util.Scanner;

public class B1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int anterior = 0, depois = 1, resultado = 0;

        for(int i = 0; i < n; i++) {

            // 0 1 1 2 3 5 8 13 SOMA DOS DOIS ANTERIORES
            System.out.print(resultado + " ");
            resultado = anterior + depois;
            depois = anterior;
            anterior = resultado;
        }

        sc.close();
    }
}
