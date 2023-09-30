/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp.exa.pkg1.eva.pkg1.e6;

import java.util.Scanner;

/**
 *
 * @author ra136
 */
public class FPEXA1EVA1E6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner (System.in);
        
        //la variable a equivale a velocidad angular inicial, b equivale a velocidad angular final, c equivale tiempo de rotacion, d equivale a radio de la rueda
        double a;
        double b;
        double c;
        double d;
        double e = 2;
        double f = 3.1416;
        
        System.out.println("Indique la velocidad angular inicial en rad/s");
        a = teclado.nextDouble();
        
        System.out.println("Indique la velocidad angular final en rad/s");
        b = teclado.nextDouble();
        
        System.out.println("Indique tiempo de rotacion en segundos");
        c = teclado.nextDouble();
        
        System.out.println("Indique el radio de la rueda en metros");
        d = teclado.nextDouble();
        
        System.out.print("La distancia angular recorrida es:");
        System.out.println(b-a/e*c/d);
        
        System.out.print("La distancia recorrida en metros es:");
        System.out.println(b/e);
        
        System.out.print("La velocidad angular promedio recorrida es:");
        System.out.println(b-a/e);
        
        System.out.println("La velocidad en m/s promedio recorrida");
        System.out.println(b*a/e);
        
        System.out.print("La aceleracion angular es:");
        System.out.println(b-a/c);
        
        System.out.print("La aceleracion m/s es:");
        System.out.println(b*a/c);
        
        System.out.print("La frecuencia de giro en Hz es:");
        System.out.println(b-a/e/f);
       }
        
    
}
