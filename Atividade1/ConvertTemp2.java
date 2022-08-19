import java.util.Scanner;

public class ConvertTemp2 {
    public static void main(String[] args) {
        double C, F;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        F = ler.nextDouble();
        C = (F - 32) * 0.55555555555;
        System.out.printf("O valor da temperatura em Celsius é: %.2f ", C);
    }
}
