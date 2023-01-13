package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class Vinte {
    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);
        int A,B,C,D;
        System.out.println("Digite o primeiro numero:");
        A = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        B = ler.nextInt();
        System.out.println("Digite o terceiro numero:");
        C = ler.nextInt();
        System.out.println("Digite o quarto numero:");
        D = ler.nextInt();
        if(A%2==0 & A%3==0){
            System.out.println("Esse numero é divisivel por 2 E 3: " + A);
        }
        if(B%2==0 & B%3==0){
            System.out.println("Esse numero é divisivel por 2 E 3: " + B);
        }
        if(C%2==0 & C%3==0){
            System.out.println("Esse numero é divisivel por 2 E 3: " + C);
        }
        if(D%2==0 & D%3==0){
            System.out.println("Esse numero é divisivel por 2 E 3: " + D);
        }
    }
}
