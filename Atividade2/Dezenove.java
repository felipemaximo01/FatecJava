package Java.Atividade2;

import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1,N2,N3,N4,M;
        System.out.println("Digite a primeira nota: ");
        N1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        N4 = ler.nextDouble();
        M = (N1+N2+N3+N4)/4;
        if(M>=7){
            System.out.printf("O aluno foi aprovado com a média de: %.2f", M);
        }
        else{
            System.out.printf("O aluno foi reprovado com a média de: %.2f", M);
        }
    }
}
