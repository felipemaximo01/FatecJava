package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class TrintaEUm {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, F;
        System.out.println("Digite um numero:");
        A = ler.nextInt();
        for(int i=A-1; i>=1; i--){
            A=A*i;
        }
        System.out.println("O Fatorial do numero digitado é: " + A);
    }
}
