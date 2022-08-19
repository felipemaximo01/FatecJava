import java.util.Scanner;

public class LerMultiplicar{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite um valor");
        a = ler.nextInt();
        System.out.println("Digite um valor");
        b = ler.nextInt();
        c = a * b;
        System.out.println("Os valores multiplicados são: " + c);
    }
}