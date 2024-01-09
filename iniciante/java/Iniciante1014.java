package iniciante;

import java.util.Scanner;

public class Iniciante1014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double litros = sc.nextDouble();

        System.out.println(String.format("%.3f km/l", distancia/litros));

        sc.close();
    }
}
