package Java.Atividade2;

import java.util.Scanner;

public class VinteESeis{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A;
        System.out.println("Digite um numero inteiro:");
        A = ler.nextInt();
        if(A < 3){
            System.out.println(A);
        }
    }
}