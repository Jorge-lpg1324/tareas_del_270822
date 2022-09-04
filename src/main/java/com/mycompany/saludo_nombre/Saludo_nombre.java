/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.saludo_nombre;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class Saludo_nombre {

    public static void main(String[] args) {
         
        System.out.println("Por favor ingrese su nombre");
        
        String nombre_leido;
        Scanner scan = new Scanner(System.in);
        
        nombre_leido = scan.nextLine();
        
       
        System.out.println("Buenos días " + nombre_leido);
        
        
        
    }
}
