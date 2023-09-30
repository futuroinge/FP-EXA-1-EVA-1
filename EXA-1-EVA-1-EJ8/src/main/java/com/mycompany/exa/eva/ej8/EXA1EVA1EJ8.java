/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exa.eva.ej8;

import java.util.Scanner;

public class EXA1EVA1EJ8 {

    public static void main(String[] args) {
        System.out.println("Captura los datos correspondientes de hiperbola horizontal");
        System.out.println("Generara los vertices, focos, y la distancia del centro al foco");
        
        Scanner input = new Scanner(System.in);
        
        double centroh, centrok, divisorA, divisorB, foco1, foco2, vertice1, vertice2,valorc;
        
        System.out.println("Capturar el valor del centro en el eje X:");
        centroh= input.nextFloat();
        System.out.println("Capturar el valor del centro en el eje Y:");
        centrok= input.nextFloat();
        System.out.println("Capturar los divisores empezando por A seguido de B");
        divisorA= input.nextFloat();
        divisorB= input.nextFloat();
        
        valorc = Math.sqrt((divisorA*divisorA)+(divisorB*divisorB));
        foco1= centroh+valorc;
        foco2= centroh-valorc;
        vertice1= centroh+divisorA;
        vertice2= centroh-divisorA;
        
        System.out.println("La distancia del centro al foco es:" + valorc);
        System.out.println("Las coordenadas de los focos son:"+"\nFoco 1:"+foco1+","+centrok);
        System.out.println("Foco 2:"+foco2+","+centrok);
        
        System.out.println("Las coordenadas de los vertices son:"+"\nVertice 1:"+vertice1+","+centrok);
        System.out.println("Vertice 2:"+ vertice2+","+centrok);
        
        
    }
}
