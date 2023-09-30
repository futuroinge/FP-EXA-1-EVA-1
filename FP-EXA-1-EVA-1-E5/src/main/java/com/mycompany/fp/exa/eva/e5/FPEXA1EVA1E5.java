/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp.exa.eva.e5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FPEXA1EVA1E5 {

    public static void main(String[] args) {
        
        double velocidad;
        double Hm;
        double d;
        double g;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Un cañon dispara una bala...");
         
         System.out.println("Introduce la velocidad de la bala de cañon (m/s):");
         velocidad = input.nextDouble();
         
         g = 9.81;
     
         Hm = (Math.pow(5, 2) * Math.pow(Math.sin(45), 2)) / (2*g);
         System.out.println("La altura máxima de la bala es:");
         System.out.println(Hm + "m");
        
         d = (Math.pow(velocidad, 2)* Math.cos(45) * Math.sin(45) * 2 ) / g;
         System.out.println("La distancia alcanzada es:");
         System.out.println(d + "m");
        
        
    }
}
