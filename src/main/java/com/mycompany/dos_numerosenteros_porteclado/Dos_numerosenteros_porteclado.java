/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dos_numerosenteros_porteclado;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class Dos_numerosenteros_porteclado {

    public static void main(String[] args) {
      
        int numero1;
        int numero2;
        
        Scanner scan = new Scanner(System.in);
        
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        
        System.out.println("El primer número es " + numero1);
        System.out.println("El segundo número es " + numero2);
        
    }
}
