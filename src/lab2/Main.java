package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Ingrese el ancho del rectángulo: ");
            int ancho = scanner.nextInt();
            
            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = scanner.nextInt();
            
            Rectangulo rectangulo = new Rectangulo(ancho, altura);
            
            int area = rectangulo.calcularArea();
            System.out.println("El área del rectángulo es: " + area);
        } catch (RectanguloException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
//Jonathan Andres Rodriguez Blandon - IIC 2023 - Quiz