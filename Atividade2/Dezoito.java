package Java.Atividade2;

import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A,B;
        System.out.println("Digite o primeiro numero:");
        A = ler.nextInt();
        System.out.println("Digite o Segundo numero:");
        B = ler.nextInt();
        if(A > B){
            System.out.printf("A diferença do maior para o menor é: %d", A-B);
        }
        else{
            System.out.printf("A diferença do maior para o menor é: %d", B-A);
        }
    }
}
