/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numero_doble_triple;

/**
 *
 * @author jorge
 */

import java.util.Scanner;

public class Numero_doble_triple {

    public static void main(String[] args) {
        
        int numero;
        int numero_doble;
        int numero_triple;
        
        System.out.println("Escriba un número para saber su doble y triple");
        
        Scanner scan = new Scanner(System.in);
        
        numero = scan.nextInt();
        
        numero_doble = numero * 2;
        numero_triple = numero * 3;
        
        System.out.println("El doble de " + numero + " = " + numero_doble);
        System.out.println("El triple de " + numero + " = " + numero_triple);
        
        
    }
}
