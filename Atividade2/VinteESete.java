package Java.Atividade2;

import java.util.Scanner;

public class VinteESete{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double VarPedi, VarQuant, VarValor;
        System.out.println("Digite o código do item");
        VarPedi = ler.nextDouble();
        System.out.println("Digite a quantidade");
        VarQuant = ler.nextDouble();
        if(VarPedi == 100){
            VarValor = VarQuant * 1.2;
            System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
        }
        else{
            if(VarPedi == 101){
                VarValor = VarQuant * 1.3;
                System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
            }
            else{
                if(VarPedi == 102){
                    VarValor = VarQuant * 1.5;
                    System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
                }
                else{
                    if(VarPedi == 103){
                        VarValor = VarQuant * 1.2;
                        System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
                    }
                    else{
                        if(VarPedi == 104){
                            VarValor = VarQuant * 1.3;
                            System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
                        }
                        else{
                            if(VarPedi == 105){
                                VarValor = VarQuant * 1.0;
                                System.out.printf("Valor total a ser pago: R$%.2f", VarValor );
                            }
                            else{
                                System.out.println("Item Invalido");
                            }
                        }
                    }
                }
            }
        }
    }
}