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
public class JavaEjercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, precio =5200,horasextra = 6400, var1;
        long var2,he;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas"));
        if (horas <45){
        var1 = (int)(horas*precio);
        JOptionPane.showMessageDialog(null, "Tu pago es de: $"+var1);
        }else if (horas>45){
        he = (long)((horas-45)*(horasextra));
        var2 = (long) ((45*precio)+he);
        JOptionPane.showMessageDialog(null, "Tu pago es de: $"+var2);
        }
        
        
    }
    
}


