package Java.Atividade2;

public class TrintaESeis {
    public static void main(String[] args) {
        int F;
        for(int i = 10; i<=100; i = i + 10){
            F = (9 * i + 160)/5;
            System.out.printf("%d°F\n%d°C\n", F, i);
        }
    }
}
