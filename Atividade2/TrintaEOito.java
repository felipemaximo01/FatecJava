package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class TrintaEOito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Num[] = new int[800];
        for(int i = 0; i<800; i++){
            Num[i] = ler.nextInt();
        }
        for(int i = 0; i<800; i++){
            if(Num[i]%7 == 0 & Num[i]%8==0){
                System.out.println(Num[i]);
            }
        }
    }
}
