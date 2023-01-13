package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class Dezessete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A;
        System.out.println("Digite um numero inteiro");
        A = ler.nextInt();
        if(A < 0){
            System.out.println(A*-1);
        }
        else{
            System.out.println(A);
        }
    }
}
