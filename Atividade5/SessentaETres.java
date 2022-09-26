//programa para ler a altura e largura de um retangulo e exibir a sua area, perimetro e diagonal.

package Java.Atividade5;

import java.util.Scanner;

public class SessentaETres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.println("Digite altura do Retangulo:");
        ret.altRetangulo = ler.nextDouble();
        System.out.println("Digite largura do Retangulo:");
        ret.largRetangulo = ler.nextDouble();
        System.out.println("Area: " + ret.calcArea());
        System.out.println("Perimetro: " + ret.calcPerimetro());
        System.out.printf("Diagonal: %.2f ", ret.calcDiagonal());   
    }
}
