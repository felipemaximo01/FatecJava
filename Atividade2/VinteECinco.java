package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class VinteECinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A;
        System.out.println("Digite um numero:");
        A = ler.nextInt();
        if(A >=1 & A<=9){
            System.out.println("O valor está na faixa");
        }
        else{
            System.out.println("O valor está fora da faixa");
        }
    }
}
