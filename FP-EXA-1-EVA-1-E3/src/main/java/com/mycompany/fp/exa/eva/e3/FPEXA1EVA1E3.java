/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp.exa.eva.e3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FPEXA1EVA1E3 {

    public static void main(String[] args) {
        double radio;
        double velocidad;
        
        double área;
        double flujo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcula los  m³ que fluyen en tu agua");
        System.out.println("Introduce el valor del radio del tubo (m):");
        radio = input.nextDouble();
        System.out.println("Introduce el valor de la velocidad del agua (m/s):");
        velocidad = input.nextDouble();
        
        área = Math.PI * Math.pow(radio, 2);
        flujo = área * velocidad;
        
        System.out.println("El flujo del agua es:");
        System.out.println(flujo + " m³/s");
        
        
        
        
    }
}
