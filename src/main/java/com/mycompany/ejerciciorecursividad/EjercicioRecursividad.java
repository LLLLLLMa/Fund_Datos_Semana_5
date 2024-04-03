/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciorecursividad;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author pclab0.pc18
 */
public class EjercicioRecursividad {

    public static NumeroReverso numeroReverso = new NumeroReverso();
    public static Scanner leer;
    
    public static void main(String[] args) {
        leer = new Scanner(System.in);
        MostrarOpciones();
    }
    
    public static void MostrarOpciones()
    {
        boolean flag = true;
        while (flag)
        {
            System.out.println("1.........Ingresar un numero para invertir");
            System.out.println("2.........Salir");
            try{
                System.out.println("Ingrese su opcion: ");
                int opcion = leer.nextInt();

                while(opcion < 1 || opcion > 2) {
                    System.out.println("Error, ingrese una opcion valida");
                    opcion = leer.nextInt();
                }

                switch (opcion)
                {
                    case 1:
                        System.out.println("Ingrese un numero: ");
                        double num = leer.nextDouble();
                        numeroReverso.DigitosInvertidos(num, 0);
                        break;
                    case 2:
                        flag = false;
                        System.out.println("Saliendo del programa...");
                        break;
                }
            }
            catch (InputMismatchException ex)
            {
                 System.out.println("Error, ingrese un numero");
                 leer.next();
            }
        }
    }
}
