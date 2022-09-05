package Java.Atividade2;

import java.util.Scanner;

public class VinteEnove{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int X, R;
        System.out.println("Digite um valor:");
        X = ler.nextInt();
        for(int i =0;i<5;i++){
            R = X*3;
            System.out.println(R);
        }
    }
}