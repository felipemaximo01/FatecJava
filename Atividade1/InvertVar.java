package Java.Atividade1;

import java.util.Scanner;

public class InvertVar {
    public static void main(String[] args) {
        int A, B, C;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor");
        A = ler.nextInt();
        System.out.println("Digite um valor");
        B = ler.nextInt();
        C = A;
        A = B;
        B = C;
        System.out.println(A +" "+ B);
         
    }
}
