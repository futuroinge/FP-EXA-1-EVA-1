/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exa.eva.ej7;
import java.util.Scanner;

public class EXA1EVA1EJ7 {
    public static void main(String[] args) {
        System.out.println("Dada la funcion y=x^2");
        System.out.println("Se puede calcular la pendiente de un punto(x) y el area entre dos valores(a,b)");
   
        float pendiente, area, b, a, x;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Para calcular el valor de la pendiente inserte valor:");
        x =input.nextFloat();
        System.out.println("Para calcular el valor del area inserte los valores (a,b) de menor a mayor:");
        a=input.nextFloat();
        b=input.nextFloat();
        
        pendiente = x*2;
        area = ((b*b*b)-(a*a*a))/3;
        
        System.out.println("La pendiente es:"+pendiente);
        System.out.println("El area es:"+area);
    }
}
