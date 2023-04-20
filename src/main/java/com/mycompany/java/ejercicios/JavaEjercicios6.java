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
public class JavaEjercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,x,c;
        double a2,b2;
        
         a = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor a"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor b"));
         
         a2 = Math.pow(a, 2);
         b2 = Math.pow(b, 2);
         c = (int) (2*(a*b));
         x = (int)(a2+b2+c);  
         
         JOptionPane.showMessageDialog(null, "El resultado de x es: "+x);
    }
    
}


