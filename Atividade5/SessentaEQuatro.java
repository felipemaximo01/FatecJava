/*programa para ler nome, salario bruto e descontos de um funcionario e exibir o nome e salário liquido, também exibir o resultado de um calculo 
para um aumento baseado em uma porcentagem fornecida pelo usuário*/
package Java.Atividade5;

import java.util.Scanner;

public class SessentaEQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Digite o nome do funcionário:");
        func.nome = ler.nextLine();
        System.out.println("Digite o Salário bruto:");
        func.salarioBruto = ler.nextDouble();
        System.out.println("Digite o valor de desconto:");
        func.desconto = ler.nextDouble();
        System.out.printf("Nome: %s \nSalário liquido: R$ %.2f\n", func.nome, func.SalarioLiquido());
        System.out.println("Deseja aumentar o salário em qual porcentagem:");
        func.aumentarSalario(ler.nextDouble());
        System.out.println("Novo Salário bruto: R$" + func.salarioBruto);
    }
}
