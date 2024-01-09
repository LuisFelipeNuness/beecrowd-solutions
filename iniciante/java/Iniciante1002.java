package iniciante;

import java.util.Scanner;

public class Iniciante1002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        System.out.println(String.format("A=%.4f", 3.14159 * Math.pow(raio, 2)));

        sc.close();
    }
}
