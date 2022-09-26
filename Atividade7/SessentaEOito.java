package Java.Atividade7;

public class SessentaEOito {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe", "12345", 8, 10, 0);
        Aluno aluno2 = new Aluno("Felps", "67890", 5, 1, 10);
        System.out.println(aluno1.toString());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Média Final: " + aluno1.calcularMediaFinal());
        System.out.println("");
        System.out.println(aluno2.toString());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Média Final: " + aluno2.calcularMediaFinal());
    }
}
