package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class Dezesseis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, C;
        System.out.println("Digite os numeros");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        if(A < B & A < C & B < C){
            System.out.println(A + " " + B + " " + C);
        }
        else{
            if(A < B & A < C & C < B){
                System.out.println(A+" " + C+" " + B);
            }
            else{
                if(B < A & B < C & A < C){
                    System.out.println(B+" " + A+" " + C);
                }
                else{
                    if(B < A & B < C & C < A){
                        System.out.println(B+" " + C+" " + A);
                    }
                    else{
                        if(C < A & C < B & A < B){
                            System.out.println(C+" " + A+" " + B);
                        }
                        else{
                            System.out.println(C+" " + B+" " + A);
                        }
                    }
                }
            }
        }
    }    
}
