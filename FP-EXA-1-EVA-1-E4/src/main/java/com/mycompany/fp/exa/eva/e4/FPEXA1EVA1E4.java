/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp.exa.eva.e4;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class FPEXA1EVA1E4 {

    public static void main(String[] args) {
       Scanner lector=new Scanner(System.in);
       double R1,R2,R3,R4,R5,IT,V,RT,I1,I2,I3,I4,I5;
        System.out.println("Captura las resitencias");
       System.out.println("Ingrese el valor de R1:");
        R1= lector.nextDouble();
        System.out.println("Ingrese el valor de R2:");
        R2 = lector.nextDouble();
        System.out.println("Ingrese el valor de R3:");
        R3 = lector.nextDouble();
        System.out.println("Ingrese el Valor de R4");
        R4= lector.nextDouble();
        System.out.println("Ingrese el valor de R5");
        R5= lector.nextDouble();
        System.out.println("Ingrese el Voltaje:");
        V=lector.nextDouble();
        RT= 1/((1/R1)+(1/R2)+(1/R3)+(1/R4)+(1/R5));
        IT= V/RT;
        I1 = V/R1;
        I2= V/R2;
        I3= V/R3;
        I4= V/R4;
        I5=V/R5;
        System.out.println(" Su resitencia total equivale a ");
        System.out.println(RT+" ohms ");
        System.out.println(" Su corriente 1 es:");
        System.out.println(I1+" Ampers ");
        System.out.println(" Su corriente 2 es:");
        System.out.println(I2+" Ampers ");
        System.out.println(" Su corriente 3 es ");
        System.out.println(I3+" Ampers ");
        System.out.println(" Su corriente 4 es:");
        System.out.println(I4+" Ampers ");
        System.out.println(" Su corriente 5 es:");
        System.out.println(I5+" Ampers ");
        System.out.println(" Su corriente total es");
        System.out.println(IT+" Ampers ");
       
        
    }
}
