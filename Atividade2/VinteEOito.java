package TecnicasDeProgramacao.Atividade2;

import java.util.Scanner;

public class VinteEOito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double VarSal, VarCar, VarNSal, VarDif;
        System.out.println("Digite o código do cargo:");
        VarCar = ler.nextDouble();
        System.out.println("Digite o salário:");
        VarSal = ler.nextDouble();
        if(VarCar == 101){
            VarNSal = VarSal + (VarSal * 0.1);
            VarDif = VarNSal - VarSal;
            System.out.printf("O valor do antigo salario é: R$%.2f\n", VarSal);
            System.out.printf("O valor do novo salario é: R$%.2f \n", VarNSal);
            System.out.printf("A diferença entre os dois é: R$%.2f ", VarDif);
        }
        else{
            if(VarCar == 102){
                VarNSal = VarSal + (VarSal * 0.2);
                VarDif = VarNSal - VarSal;
                System.out.printf("O valor do antigo salario é: R$%.2f\n", VarSal);
                System.out.printf("O valor do novo salario é: R$%.2f \n", VarNSal);
                System.out.printf("A diferença entre os dois é: R$%.2f ", VarDif);
            }
            else{
                if(VarCar == 103){
                    VarNSal = VarSal + (VarSal * 0.3);
                    VarDif = VarNSal - VarSal;
                    System.out.printf("O valor do antigo salario é: R$%.2f\n", VarSal);
                    System.out.printf("O valor do novo salario é: R$%.2f \n", VarNSal);
                    System.out.printf("A diferença entre os dois é: R$%.2f ", VarDif);
                }
                else{
                    VarNSal = VarSal + (VarSal * 0.4);
                    VarDif = VarNSal - VarSal;
                    System.out.printf("O valor do antigo salario é: R$%.2f\n", VarSal);
                    System.out.printf("O valor do novo salario é: R$%.2f \n", VarNSal);
                    System.out.printf("A diferença entre os dois é: R$%.2f ", VarDif);
                }
            }
        }
    }
}
