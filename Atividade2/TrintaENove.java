package Java.Atividade2;

import java.util.Scanner;

public class TrintaENove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Num[] = new int[800];
        int P = 0,I = 0;
        for(int i = 0; i<800; i++){
            Num[i] = ler.nextInt();
            if(Num[i]%2 == 0){
                P++;
            }
            else{
                I++;
            }
        }
        System.out.println("A Quantidade de Pares digitados são: "+ P);
        System.out.println("A Quantidade de Impares digitados são: "+ I);

    }
}