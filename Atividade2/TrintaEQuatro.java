package Java.Atividade2;

public class TrintaEQuatro {
    public static void main(String[] args) {
        int Total = 0;
        for(int i=1; i<=500; i++){
            if(i%2==0){
            Total = Total + i;
            }
        }
        System.out.println("A soma total dos numeros pares de 1 a 500 é: " + Total);
    }
}
