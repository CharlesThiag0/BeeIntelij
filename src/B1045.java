import java.util.Scanner;

public class B1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vect[] = new double[3];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        for (int i = 1; i < vect.length; i++){
            for (int j = 0; j < vect.length; j++) {
                if(vect[i] > vect[j]){
                    double aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }

        if (vect[0] >= vect[1] + vect[2]) {
            //se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (Math.pow(vect[0], 2.0) == Math.pow(vect[1], 2.0) + Math.pow(vect[2], 2.0)) {
                // se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
                System.out.println("TRINGULO RETANGULO");
            }
            if (Math.pow(vect[0], 2.0) > Math.pow(vect[1], 2.0) + Math.pow(vect[2], 2.0)) {
                //se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(vect[0], 2.0) < Math.pow(vect[1], 2.0) + Math.pow(vect[2], 2.0)) {
                // se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
                System.out.println("TRINGULO ACUTAGULO");
            }
            if (vect[0] == vect[1] && vect[2] == vect[0]) {
                //  se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (vect[0] == vect[1] && vect[2] != vect[0] ||
                    vect[1] == vect[2] && vect[0] != vect[1]){
                // se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
                System.out.println("TRIANGULO ISOCELES");
            }
        }
        sc.close();
    }
}
