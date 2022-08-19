import java.util.Scanner;

public class IdadeDia{
    public static void main(String[] args) {
        int A, M, D, DT;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade expressa em anos, meses e dias");
        A = ler.nextInt();
        M = ler.nextInt();
        D = ler.nextInt();
        DT = (A * 365) + (M * 30) + D;
        System.out.println("Você tem " + DT + " Dias");
    }
}