package ejerciciodos;

import java.util.Scanner;

public class MainDos {
    public static void main(String[] args) {
//hola
/**
 * 2) Cambia el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char)
 * y muestre su código en la tabla ASCII. (Pista: para convertir un carácter a número utilizaremos “(int)+carácter”)
 */
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter= reader.next().charAt(0);
        int variable= (int) +caracter;
        System.out.println("El valor del caracter en la tabla ASCII es "+variable);
    }
}
