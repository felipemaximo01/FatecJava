import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        double C, F;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em celsius: ");
        C = ler.nextDouble();
        F = (9 * C + 160) / 5;
        System.out.printf("O valor convertido para Fahrenheit é: %.2f ", F);
    }
}
