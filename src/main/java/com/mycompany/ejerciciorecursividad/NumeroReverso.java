/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorecursividad;

/**
 *
 * @author pclab0.pc18
 */
public class NumeroReverso {
    public NumeroReverso()
    {
        
    }
    
    public double DigitosInvertidos(double n, double suma)
    {
        if (n != 0)
        {
            double cantidad_digitos_numero = Math.floor(Math.log10(Math.abs(n)))+1;
            double digito = n % 10;
            n -= digito;
            n /= 10;
            return DigitosInvertidos(n, suma + digito*Math.pow(10, cantidad_digitos_numero));
        }
        else
        {
            System.out.println("Su numero invertido: " + (int) suma / 10);
            return suma / 10;
        }
    }
}
