package iniciante;

import java.util.Scanner;

public class Iniciante1006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = ((A*2) + (B*3) + (C*5))/10;

        System.out.println(String.format("MEDIA = %.1f", media));

        sc.close();
    }
}
