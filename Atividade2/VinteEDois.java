package Java.Atividade2;

import java.util.Scanner;

public class VinteEDois{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, C;
        System.out.println("Digite o primeiro numero:");
        A = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        B = ler.nextInt();
        System.out.println("Digite o terceiro numero:");
        C = ler.nextInt();
        if(A > B & A > C){
            System.out.println("Esse é o maior valor digitado: " + A);
        }
        else{
            if(B > A & B > C){
                System.out.println("Esse é o maior valor digitado: " + B);
            }
            else{
                System.out.println("Esse é o maior valor digitado: " + C);
            }
        }
    }
}