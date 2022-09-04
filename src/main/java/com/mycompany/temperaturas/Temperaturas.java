/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temperaturas;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double F, C;
        
        System.out.println("Ingresar la cantidad de grados Centigrados que desea convertir: ");
        
        C = lector.nextDouble();
        
        F = 32 + (9 * C/5.0);
        
        System.out.println(" Los " + C + " grados Centigrados equivalen a " + F + " grados Fahrenheit.");
        
        
        
        
        
    }
}
