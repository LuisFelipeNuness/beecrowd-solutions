package iniciante;

import java.util.Scanner;

public class Iniciante1005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double media = ((A*3.5) + (B*7.5))/11;

        System.out.println(String.format("MEDIA = %.5f", media));

        sc.close();
    }
}
