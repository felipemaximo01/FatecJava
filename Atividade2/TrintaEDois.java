package Java.Atividade2;

import java.util.Scanner;

public class TrintaEDois{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Num,Res;
        System.out.println("Digite um numero:");
        Num = ler.nextInt();
        for(int i=0; i<=10; i++){
            Res = Num*i;
            System.out.printf("%d X %d = %d \n", Num,i,Res);
        }
    }
}