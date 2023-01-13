package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class TrintaESete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double Num = 0;
        double Total = 0;
        for(int i = 1; i<=100; i++){
            Num = ler.nextInt();
            Total = Total + Num;
        }
        System.out.println("Somatorial Total dos numeros digitados: " + Total);
        Total = Total/5;
        System.out.println("Media: " + Total);
    }
}
