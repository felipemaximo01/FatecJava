package Java.Atividade1;

import java.util.Scanner;

public class VolumeLata {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double R, A, V;
        System.out.println("Digite o valor do Raio: ");
        R = ler.nextDouble();
        System.out.println("Digite o valor do Altura: ");
        A = ler.nextDouble();
        V = 3.14159 * (R*R) * A;
        System.out.println("O volume é: " + V);
    }
}
