package Java.Atividade2;

import java.util.Scanner;

public class VinteEQuatro{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A;
        System.out.println("Digite um numero:");
        A = ler.nextInt();
        if(A%2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}