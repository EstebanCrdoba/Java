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
public class JavaEjercicios9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    long num1,num2 = 0;
        num1 = Long.parseLong(JOptionPane.showInputDialog("Eliga hasta que numero se imprime"));
        
       while(num2 < num1){
           num2++;
           System.out.println("Los numeros son:"+num2);
       }
        
    }
    
}
