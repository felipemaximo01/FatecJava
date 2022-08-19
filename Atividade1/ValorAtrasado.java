import java.util.Scanner;

public class ValorAtrasado{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double P, V, T;
        int Temp;
        System.out.println("Digite o valor atrasado: ");
        V = ler.nextDouble();
        System.out.println("Digite a taxa: ");
        T = ler.nextDouble();
        System.out.println("Digite a quantidade de meses que o valor esta atrasado: ");
        Temp= ler.nextInt();
        P = V + (V * (T/100) * Temp);
        System.out.print("O valor das prestações serão: "+ P);        
    }
}