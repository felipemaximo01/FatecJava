package Java.Atividade3;

/*Criar dois vetores, no primeiro vetor alocar os numeros de 1 a 10 e no segundo vetor alocar esses mesmo numeros multiplicados por dois */

public class QuarentaEOito {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        int b = 0;
        for (int i = 0; i < A.length; i++) {
            b++;
            A[i] = b;
        }
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d X 2 = %d \n", A[i], B[i]);
        }
    }
}
