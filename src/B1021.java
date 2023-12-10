import java.util.Scanner;

public class B1021 { // NÃO ACEITO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dinheiro = sc.nextDouble();
        int notas[] = {100, 50, 20, 10, 5, 2};
        int moedas[] = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota: notas) {
            int quantidade = (int) (dinheiro / nota);
            dinheiro %= nota;
            System.out.printf("%d nota(s) de R$ %.2f\n",quantidade, nota / 1.0);
        }

        System.out.printf("MOEDAS:\n");
        for (int  moeda : moedas) {
            int quantidade = (int) (dinheiro / moeda);
            dinheiro %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, moeda / 100.0);
        }

        sc.close();
    }
}
