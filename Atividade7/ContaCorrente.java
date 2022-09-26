package Java.Atividade7;

public class ContaCorrente {
    private String nome;
    private boolean sexo;
    private int idade;
    private int numConta;
    private boolean flag;
    private double saldo;
    public String mensagem;

    public String getnome() {
        return nome;
    }

    public void setnome(String nnome) {
        nome = nnome;
    }

    public String getsexo() {
        if (sexo == true) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }

    public void setsexo(Boolean nsexo) {
        sexo = nsexo;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int nidade) {
        idade = nidade;
    }

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int nnum) {
        numConta = nnum;
    }

    public String getflag() {
        if (flag == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setflag(boolean nflag) {
        flag = nflag;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double nsaldo) {
        saldo = nsaldo;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Valor indisponivel para saque");
        }
    }

    public String saldo() {
        if (flag == true) {
            mensagem = "Nome: " + nome + " Numero da conta: " + numConta + " Conjunta? Sim" + " Saldo: " + saldo;
        } 
        else {
            mensagem = "Nome: " + nome + " Numero da conta: " + numConta + " Conjunta? Não" + " Saldo: " + saldo;
        }
        return mensagem;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
}
