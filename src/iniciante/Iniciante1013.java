package iniciante;

import java.util.Scanner;

public class Iniciante1013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maior = A;

        if(B>A){
            maior = B;
        }

        if(C>B){
            maior = C;
        }

        if(A>C){
            maior = A;
        }

        System.out.println(maior + " eh o maior");

        sc.close();
    }
}
