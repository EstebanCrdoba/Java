/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java.ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author EstebanC
 */
public class JavaEjercicios10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int num1,res;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Elija el numero para multiplicar hasta 10"));
        
        for (int num2 = 1; num2 <= 10; num2++) {
            res = (int) (num1*num2);
            System.out.println("La multiplicacion "+num1+"*"+num2+" es: "+res);
        }
      
      
            
        
    }
    
}
