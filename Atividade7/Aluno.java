package TecnicasDeProgramacao.Atividade7;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;
    private String mensagem;

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){    
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }
    public String toString(){
        mensagem = "Nome: " + nome + "\nMatricula: " + matricula + "\n1° Nota: " + nota1 + "\n2° Nota: " + nota2 + "\nNota de Reavaliação: " + notaReavaliacao;
        return mensagem;
    }
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }
    public double calcularMediaFinal(){
        if(calcularMedia()>=6){
            return calcularMedia();
        }
        else{
            return (calcularMedia() + notaReavaliacao)/2;
        }
    }
}
