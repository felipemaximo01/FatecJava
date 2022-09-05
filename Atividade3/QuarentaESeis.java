package Java.Atividade3;

//Felipe Maximo Colen
//2171392211043
/*Criar um vetor alocar os numeros de 1 a 10 nele e exibi-lo */

public class QuarentaESeis {
    public static void main(String[] args) {
        int Vet[] = new int[10];
        int b = 0;
        for(int i = 0; i<Vet.length; i++){
            b++;
            Vet[i] = b;
        }
        for(int i = 0; i<Vet.length; i++){
            System.out.println(Vet[i]);
        }
    }
}
