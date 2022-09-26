package Java.Atividade5;

public class Retangulo {
    double largRetangulo;
    double altRetangulo;
    double area;
    double perimetro;
    double diagonal;
    
    public double calcArea(){
        area = largRetangulo*altRetangulo;
        return area;
    }
    public double calcPerimetro(){
        perimetro = 2*(largRetangulo+altRetangulo);
        return perimetro;
    }
    public double calcDiagonal(){
        diagonal = (altRetangulo*altRetangulo)+(largRetangulo*largRetangulo);
        diagonal = Math.sqrt(diagonal);
        return diagonal;
    }
}
