import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        int a;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor");
        a = ler.nextInt();
        a = a*a;
        System.out.println("O quadrado desse numero é: " + a);
    }
}
