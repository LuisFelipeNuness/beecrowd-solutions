package iniciante;

import java.util.Scanner;

public class Iniciante1010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigoP1 = sc.nextInt();
        int nmrP1 = sc.nextInt();
        double valorP1 = sc.nextDouble();
        int codigoP2 = sc.nextInt();
        int nmrP2 = sc.nextInt();
        double valorP2 = sc.nextDouble();

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", ((nmrP1*valorP1) + (nmrP2*valorP2))));

        sc.close();
    }
}
