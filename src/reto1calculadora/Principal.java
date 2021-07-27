/*
fori + Tab: FOR
fcom + Tab: Se obtiene el código para agrupar y comentar. Ejemplo
sout + Tab o soutv + Tab: Genera los System.out.println(“”).
iff + Tab: Genera los bloques if. Ejemplo
sw + Tab: Genera el switch. Ejemplo:
whilexp + Tab: Genera los bloques While. Otras variantes son whilen y whileit. Ejemplo:

opciones

AUTOR JHON SEBASTIAN CARDONA QUINTERO RETO 1
 */
package Reto1Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner captura = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        // MENU PRINCIPAL
        boolean continuar = true;
        System.out.println(" -----------------------------------------------------------------");
        System.out.println("|           \033[32mAUTOR: JHON SEBASTIAN CARDONA QUINTERO                |");
        System.out.println("|           \033[32mRETO No 1");
        System.out.println("------------------------------------------------------------------");
        while (continuar) {

            System.out.println("                        \033[35mMENU PRINCIPAL                            ");

            System.out.println("1) Sumar Numeros Enteros");
            System.out.println("2) Sumar Numeros Enteros, Negativos y Decimales");
            System.out.println("3) Restar Numeros Positivos");
            System.out.println("4) Multiplicar dos numeros Positivos");
            System.out.println("5) Potenciacion de un numero Positivo");
            System.out.println("6) Raiz de un numero Positivo");
            System.out.println("7) Division de dos nuemeros Positivos");
            System.out.println("8) Funcion Cuadratica");
            System.out.println("9) Exit");

            System.out.flush();
            int opc = operaciones.lectura("     <<Ingresar la opcion requerida>>");
            String r;
            switch (opc) {

                case 1:// suma positivos
                    System.out.println("\n_____________________________________\033[31mSUMA NUMEROS POSITIVOS_____________________________________");
                    int numero1 = operaciones.lectura("Ingrese Primer nuemro Positivo o reingresar el valor por que no es valido ");
                    int numero2 = operaciones.lectura("Ingrese Segundo nuemro Positivo o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mla Suma de " + numero1 + " + " + numero2 + " es = " + operaciones.suma(numero1, numero2));
                    r = captura.nextLine();
                    System.out.println("\f");
                    break;
                case 2:// suma enteros, negativos, decimales
                    System.out.println("\n_______________________________\033[31mSUMA NUMEROS POSITIVOS NEGATIVOS Y DECIMALES_______________________________\n");
                    Double numero11 = operaciones.lectura2("Ingrese Primer nuemro o reingresar el valor por que no es valido ");
                    Double numero22 = operaciones.lectura2("Ingrese Segundo nuemro o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mLa Suma de  " + numero11 + " + " + numero22 + " es = " + operaciones.suma2(numero11, numero22));
//                    a= captura.nextLine();
                    System.out.println((r = captura.nextLine()) + "\f");
                    break;

                case 3:// resta positivos
                    System.out.println("\n_____________________________________\033[31mRESTA NUMEROS POSITIVOS_____________________________________");
                    numero1 = operaciones.lectura("Ingrese Primer nuemro Positivo o reingresar el valor por que no es valido ");
                    numero2 = operaciones.lectura("Ingrese Segundo nuero Positivo o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mla Resta de " + numero1 + " - " + numero2 + " es = " + operaciones.resta(numero1, numero2));
                    r = captura.nextLine();
                    System.out.println("\f");
                    break;
                case 4:// multiplicacion cualquier numero
                    System.out.println("\n______________________________________\033[31mMULTIPLICACIÓN NUMEROS POSITIVOS______________________________________\n");
                    numero11 = operaciones.lectura2("Ingrese Primer nuemro o reingresar el valor por que no es valido ");
                    numero22 = operaciones.lectura2("Ingrese Segundo nuemro o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mLa Multiplicacion de  " + numero11 + " X " + numero22 + " es = " + operaciones.multiplicacion(numero11, numero22));
//                    a= captura.nextLine();
                    System.out.println((r = captura.nextLine()) + "\f");

                    break;
                case 5:// potenciacion
                    System.out.println("\n______________________________________\033[31mPOTENCIACIÓN NUMEROS REALES______________________________________\n");
                    numero11 = operaciones.lectura2("Ingrese base de la potenciacion o reingresar el valor por que no es valido ");
                    numero2 = operaciones.lectura("Ingrese la Potencia  o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mEl numero  " + numero11 + " Elevado a la " + numero2 + " Potencia es = " + operaciones.potencia(numero11, numero2));
//                    a= captura.nextLine();
                    System.out.println((r = captura.nextLine()) + "\f");
                    break;
                case 6:// raiz
                    System.out.println("\n_____________________________________\033[31mRAIZ NUEMORS  POSITIVOS_____________________________________");
                    numero1 = operaciones.lectura("Ingrese Nuemro Positivo o reingresar el valor por que no es valido ");
                    numero2 = operaciones.lectura("Ingrese la base de la raiz nuemro Positivo o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mla raiz de " + numero2 + " del numero " + numero1 + " es = " + operaciones.raiz(numero1, numero2));
                    r = captura.nextLine();
                    System.out.println("\f");
                    break;

                case 7:// raiz
                    System.out.println("\n_____________________________________\033[31mDIVISIÓN NUEMORS  POSITIVOS_____________________________________");
                    numero1 = operaciones.lectura("Ingrese Primer nuemro Positivo o reingresar el valor por que no es valido ");
                    numero2 = operaciones.lectura("Ingrese Segundo nuero Positivo o reingresar el valor por que no es valido  ");
                    System.out.println("\033[34mla Division  de " + numero1 + " entre " + numero2 + " es = " + operaciones.division(numero1, numero2));
                    r = captura.nextLine();
                    System.out.println("\f");
                    break;

                case 8:// raiz
                    System.out.println("\n______________________\033[31mFUNCIÓN CUADRATICA NUMEROS POSITIVOS______________________");
                    double a = operaciones.lectura2("Ingrese el valor de (a) ");
                    double b = operaciones.lectura2("Ingrese el valor de (b) ");
                    double c = operaciones.lectura2("Ingrese el valor de (c) ");
                    System.out.println("Datos de entrada ---   a = " + a + " b = " + b + " c = " + c + "\n Respuesta cuadratica = ");
                    operaciones.cuadratica(a, b, c);
                    System.out.println(" \033[34mValor en X1 = " + operaciones.getX1());
                    System.out.println(" \033[34mValor en X2 = " + operaciones.getX2());
                    r = captura.nextLine();
                    System.out.println("\f");
                    break;
                case 9://Exit
                    continuar = false;
                    break;
            }

        }// while

    }

}
