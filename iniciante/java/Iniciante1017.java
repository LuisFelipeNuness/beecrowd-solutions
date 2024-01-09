package iniciante;

import java.util.Scanner;

public class Iniciante1017 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        System.out.println(String.format("%.3f", (velocidade/12.0)*tempo));
    }

}
