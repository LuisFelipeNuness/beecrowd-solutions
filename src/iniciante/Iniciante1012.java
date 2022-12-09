package iniciante;

import java.util.Scanner;

public class Iniciante1012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.println(String.format("TRIANGULO: %.3f", ((A*C)/2)));
        System.out.println(String.format("CIRCULO: %.3f", (3.14159 * Math.pow(C,2))));
        System.out.println(String.format("TRAPEZIO: %.3f", ((1.0/2)*C*(A+B))));
        System.out.println(String.format("QUADRADO: %.3f", Math.pow(B,2)));
        System.out.println(String.format("RETANGULO: %.3f", (A*B)));

        sc.close();
    }
}
