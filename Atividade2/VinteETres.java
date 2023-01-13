package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class VinteETres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N1, N2, N3, N4, N5;
        System.out.println("Digite o primeiro valor:");
        N1 = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        N2 = ler.nextInt(); 
        System.out.println("Digite o terceiro valor:");
        N3 = ler.nextInt(); 
        System.out.println("Digite o quarto valor:");
        N4 = ler.nextInt(); 
        System.out.println("Digite o quinto valor:");
        N5 = ler.nextInt();
        if(N1 > N2 & N1 > N3 & N1 > N4 & N1 > N5 ){
            System.out.println("Esse é o maior valor: " + N1);
        }
        else{
            if(N2 > N1 & N2 > N3 & N2 > N4 & N2 > N5){
                System.out.println("Esse é o maior valor: " + N2);
            }
            else{
                if(N3 > N1 & N3 > N2 & N3 > N4 & N2 > N5){
                    System.out.println("Esse é o maior valor: " + N3);
                }
                else{
                    if(N4 > N1 & N4 > N2 & N4 > N3 & N4 > N5){
                        System.out.println("Esse é o maior valor: " + N4);
                    }
                    else{
                        System.out.println("Esse é o maior valor: " + N5);
                    }
                }
            }
        }
        if(N1 < N2 & N1 < N3 & N1 < N4 & N1 < N5 ){
            System.out.println("Esse é o menor valor: " + N1);
        }
        else{
            if(N2 < N1 & N2 < N3 & N2 < N4 & N2 < N5){
                System.out.println("Esse é o menor valor: " + N2);
            }
            else{
                if(N3 < N1 & N3 < N2 & N3 < N4 & N2 < N5){
                    System.out.println("Esse é o menor valor: " + N3);
                }
                else{
                    if(N4 < N1 & N4 < N2 & N4 < N3 & N4 < N5){
                        System.out.println("Esse é o menor valor: " + N4);
                    }
                    else{
                        System.out.println("Esse é o menor valor: " + N5);
                    }
                }
            }
        }    
    }
}
