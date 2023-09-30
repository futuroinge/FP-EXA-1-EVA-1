/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp.exa.eva.e2;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class FPEXA1EVA1E2 {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       double F,K,C;
        System.out.println("Ingresa los grados Farenheit ");
        F = lector.nextDouble();
        C = (F-32)*5/9;
        K = (F-32)*5/9+273.15;
        
        System.out.println(F+" grados Farenheit es equivalente a " +C+ " grados celcius ");
        System.out.println(F+" grados Farenheit es equivalente a " +K+ " grados Kelvin");
        
       
        
   
                }
}
