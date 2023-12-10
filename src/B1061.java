import java.util.Scanner;

public class B1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia, dia1;
        int diaInicial, horaInicial, minutosInicial, segundoInicial,
                diaFinal, horaFinal, minutosFinal, segundosFinal;
        int totalSegundosInicial, totalSegundosFinal, segundosTotal;

        dia = sc.next();
        diaInicial = sc.nextInt();
        horaInicial = sc.nextInt();
        sc.next();
        minutosInicial = sc.nextInt();
        sc.next();
        segundoInicial = sc.nextInt();

        dia1 = sc.next();
        diaFinal = sc.nextInt();
        horaFinal = sc.nextInt();
        sc.next();
        minutosFinal = sc.nextInt();
        sc.next();
        segundosFinal = sc.nextInt();

        totalSegundosInicial = (diaInicial -1 ) * 24 * 60 * 60 + horaInicial * 60 * 60 + minutosInicial * 60 + segundoInicial;
        totalSegundosFinal = (diaFinal  -1) * 24 * 60 * 60 + horaFinal * 60 * 60 + minutosFinal * 60 + segundosFinal;
        segundosTotal = totalSegundosFinal - totalSegundosInicial;

        int W = segundosTotal / (24 * 60 * 60);
        segundosTotal %= (24 * 60 * 60);
        int X = segundosTotal / (60 * 60);
        segundosTotal %= (60 * 60);
        int Y = segundosTotal / 60;
        int Z = segundosTotal % 60;

        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n",W, X, Y, Z);

        sc.close();
    }
}
