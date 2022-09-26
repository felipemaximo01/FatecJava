package Java.Atividade7;

public class SessentaESete{
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();
        conta1.setnome("Fernando");
        conta1.setnumConta(1234);
        conta1.setflag(false);
        conta1.setsaldo(1500.00);
        conta1.setsexo(true);
        conta1.setidade(29);
        conta2.setnome("Maria");
        conta2.setnumConta(5312);
        conta2.setflag(true);
        conta2.setsaldo(530.31);
        conta2.setsexo(false);
        conta2.setidade(45);
        conta3.setnome("João");
        conta3.setnumConta(9621);
        conta3.setflag(true);
        conta3.setsaldo(4325.12);
        conta3.setsexo(true);
        conta3.setidade(54);
        System.out.println(conta1.saldo());
        System.out.println(conta2.saldo());
        System.out.println(conta3.saldo());

    }
}