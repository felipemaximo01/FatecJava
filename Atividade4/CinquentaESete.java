//Programa para ler dados de uma conta corrente e exibi-lo.

package Java.Atividade4;

import java.util.Scanner;

public class CinquentaESete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta cliente = new Conta();
        System.out.println("Digite o numero da conta");
        cliente.numConta = Integer.parseInt(ler.nextLine());
        System.out.println("Digite o nome do cliente");
        cliente.nomeCliente = ler.nextLine();
        System.out.println("Digite o CPF");
        cliente.cpf = ler.next();
        System.out.println("Digite o Saldo da conta");
        cliente.saldo = ler.nextDouble();
        System.out.println("Nome: " + cliente.nomeCliente + "\n" + "Numero da conta: " + cliente.numConta + "\n"+ "CPF: " + cliente.cpf + "\n" + "Saldo: " + cliente.saldo);
        System.out.println("Digite valor a sacar:");
        cliente.sacar(ler.nextDouble());
        System.out.println("Saldo: " + cliente.saldo);
        System.out.println("Digite o valor a depositar:");
        cliente.depositar(ler.nextDouble());
        System.out.println("Saldo: " + cliente.saldo);
    }
}
