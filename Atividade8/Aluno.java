package TecnicasDeProgramacao.Atividade8;

//Classe aluno em que são alocadas três notas, soma as três notas e verifica se o aluno foi aprovado ou reprovado.

public  class Aluno{
    private double[] notas = new double[3];
    private String nome;

    public Aluno(){
        this.notas[0] = 0;
        this.notas[1] = 0;
        this.notas[2] = 0;
        this.nome = "";
    }

    public Aluno(double n1, double n2, double n3, String nNome){
            notas[0] = n1;
            notas[1] = n2;
            notas[2] = n3;
            nome = nNome;
    }
    public boolean verificaPassou(){
        if (calcNotaF()>=60){
            return true;
        }
        return false;
    }
    public double calcNotaF(){
        return notas[0] + notas[1] + notas[2];   
    }
    public String toString(){
        String mensagem;
        if(verificaPassou()){
            mensagem = "Nota Final = " + calcNotaF() + "\nAprovado";
            return mensagem;
        }
        mensagem = "Nota Final = " + calcNotaF() + "\nReprovado" + "\nFaltaram: " + (60-calcNotaF()) + " Pontos";
        return mensagem;
    }
    
}