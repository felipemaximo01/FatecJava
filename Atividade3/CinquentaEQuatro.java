package Java.Atividade3;

/*Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	
Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	
Após de todos os elementos do vetor A, mostrar os dois vetores */

import java.util.Scanner;

public class CinquentaEQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int VetA[] = new int[5];
        int VetB[] = new int[5];
        for(int i = 0; i<VetA.length; i++){
            System.out.println("Digite um numero: ");
            VetA[i] = ler.nextInt();
            VetB[i] = VetA[i];
        }
        for(int i = 0; i<VetA.length; i++){
            if(VetB[i] == 0){
                VetB[i] = 1;
            }
            else{
                for(int j=VetB[i]-1; j>=1; j--){
                    VetB[i] = VetB[i] * j;
                   }
            }
        }
        for (int i = 0; i<VetA.length; i++){
            System.out.printf("O fatorial de %d é %d \n", VetA[i], VetB[i]);
        }
    }
}
