//Programa para ler dados de um aluno e exibi-lo

package TecnicasDeProgramacao.Atividade4;

import java.util.Scanner;

public class CinquentaENove {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Aluno aluno = new Aluno();
       System.out.println("Digite o RA do aluno:");
       aluno.raAluno = ler.nextLine();
       System.out.println("Digite o nome do aluno:");
       aluno.nmAluno = ler.nextLine();
       System.out.println("Digite o endereço do aluno:");
       aluno.enderecoAluno = ler.nextLine();
       System.out.println("Digite o curso do aluno:");
       aluno.cursoAluno = ler.nextLine();
       System.out.println("RA: " + aluno.raAluno + "\nNome: " + aluno.nmAluno  + "\nEndereço: " + aluno.enderecoAluno + "\nCurso: " + aluno.cursoAluno);
       System.out.println("Digite o novo endereço:");
       aluno.altEnd(ler.nextLine());
       System.out.println("Novo endereço: " + aluno.enderecoAluno);
       System.out.println("Digite o novo curso do aluno:");
       aluno.altCurso(ler.nextLine());
       System.out.println("Novo curso: " + aluno.cursoAluno);
    }
}
