

package com.mycompany.radio_area_longitud_1;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class Radio_area_longitud_1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double radio, longitud, area;
        
        System.out.println("Introduzca el radio de la circunferencia ");
        
        radio = scan.nextDouble();
         longitud = 2 * Math.PI * radio;
         area = Math.PI * Math.pow(radio, 2);
         
         System.out.println("Longitud de la circunferencia: " + longitud);
         System.out.println("Area de la circunferencia: " + area);
         
         
        
    }
}
