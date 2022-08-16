package Java.Atividade1;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        float C, F;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em celsius: ");
        C = ler.nextFloat();
        F = (9 * C + 160) / 5;
        System.out.println("O valor convertido para Fahrenheit é: " + F);
    }
}
