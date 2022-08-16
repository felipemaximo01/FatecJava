package Java.Atividade1;

import java.util.Scanner;

public class ConvertTemp2 {
    public static void main(String[] args) {
        double C, F;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        F = ler.nextDouble();
        C = (F - 32) * (5/9);
        System.out.println("O valor da temperatura em Celsius é: " + C);
    }
}
