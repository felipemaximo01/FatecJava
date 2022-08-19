import java.util.Scanner;

public class DolarReal{
    public static void main(String[] args) {
        double R, D, C;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a atual cotação do dolar:");
        C = ler.nextDouble();
        System.out.println("Digite a quantidade de dolares disponivel:");
        D = ler.nextDouble();
        R = D * C;
        System.out.printf("O valor convertido em real é: %.2f", R);
    }
}