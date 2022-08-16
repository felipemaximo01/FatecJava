package Java.Atividade1;

import java.util.Scanner;

public class LerMultiplicar{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.println("");
        a = ler.nextInt();
        System.out.println("");
        b = ler.nextInt();
        c = a * b;
        System.out.println(": " + c);
    }
}