package iniciante;

import java.util.Scanner;

public class Iniciante1011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        System.out.println(String.format("VOLUME = %.3f", ((4.0/3) * 3.14159 * Math.pow(raio, 3))));

        sc.close();
    }
}
