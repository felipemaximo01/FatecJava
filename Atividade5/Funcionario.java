package TecnicasDeProgramacao.Atividade5;

public class Funcionario {
    String nome;
    double salarioBruto;
    double desconto;
    double salarioLiquido;
    
    public double SalarioLiquido(){
        salarioLiquido = salarioBruto - desconto;
        return salarioLiquido;
    }
    public void aumentarSalario(double porcentagem){
        salarioBruto = salarioBruto+(salarioBruto * (porcentagem/100));
    }
}
