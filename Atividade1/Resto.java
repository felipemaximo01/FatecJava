package Java.Atividade1;

import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        int A;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor");
        A = ler.nextInt();
        System.out.println("O resto divido por 6 é: " + A%6);
    }
}
