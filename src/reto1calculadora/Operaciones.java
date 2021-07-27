package Reto1Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {

    Scanner Captura = new Scanner(System.in);

    public int suma(int No1, int No2) {
        return No1 + No2;
    }

    public Double suma2(Double No1, Double No2) {
        return No1 + No2;
    }

    public int resta(int No1, int No2) {
        return No1 - No2;
    }

    public Double multiplicacion(Double No1, Double No2) {
        return No1 * No2;

    }

    public double division(int No1, int No2) {
        return No1 * No2;

    }

    public Double potencia(Double No1, int No2) {
        return Math.pow(No1, No2);
    }

    public double raiz(int No1, int No2) {
        return Math.pow(No1, (1 / No2));
    }
    double x1, x2;

    public void cuadratica(double a, double b, double c) {
        double potencia, raiz = 0;
        potencia = Math.pow(b, 2) - (4 * a * c);
        x1 = (-b - Math.sqrt(potencia) / 2 * a);
        x2 = (-b + Math.sqrt(potencia) / 2 * a);

    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public int lectura(String mensaje) {
        int numero = 0;
        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(Captura.nextLine());
            } catch (Exception e) {
                numero = -1;
            }
        } while (numero < 0);

        return numero;
    }

    public Double lectura2(String mensaje) {
        Double numero = null;
        do {
            System.out.print(mensaje);
            try {
                numero = Double.parseDouble(Captura.nextLine());
            } catch (Exception e) {
                System.out.println("Valor insertado NO es valido");
                numero = null;
            }
        } while (numero == null);

        return numero;
    }
}
