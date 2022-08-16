package Java.Atividade1;

import java.util.Scanner;

public class AreaCircun {
    public static void main(String[] args) {
        double R, A;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        R = ler.nextDouble();
        A = 3.14159 * (R*R);
        System.out.println("O valor da area é: " + A);
    }
}
