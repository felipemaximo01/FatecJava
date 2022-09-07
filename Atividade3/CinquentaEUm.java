package Java.Atividade3;

/*Receber duas notas em dois vetores diferentes de cinco alunos e fazer a média  */

import java.util.Scanner;

public class CinquentaEUm {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1[] = new double[5];
        double N2[] = new double[5];
        double M[] = new double[5];
        int b = 1;
        for (int i = 0; i < N1.length; i++) {
            System.out.printf("Digite a primeira nota do %d° aluno \n", b);
            N1[i] = ler.nextDouble();
            System.out.printf("Digite a segunda nota do %d° aluno \n", b);
            N2[i] = ler.nextDouble();
            M[i] = (N1[i] + N2[i]) / 2;
            b++;
        }
        b = 1;
        for (int i = 0; i < N1.length; i++) {
            System.out.printf("A média do %d° aluno é: %.1f \n", b, M[i]);
            b++;
        }
    }
}
