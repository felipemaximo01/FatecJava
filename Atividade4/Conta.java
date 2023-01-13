//Classe criada para a realização do exercicio 57.

package TecnicasDeProgramacao.Atividade4;

public class Conta {
    int numConta;
    String nomeCliente;
    String cpf;
    double saldo;

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
}