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
public class JavaEjercicios4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long num1, num2, su, re, mu, di,mo;

        num1 = Long.parseLong(JOptionPane.showInputDialog("Ingrese el primer numero :"));
        num2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese el segundo numero :"));

        su = (long) (num1 + num2);
        re = (long) (num1 - num2);
        mu = (long) (num1 * num2);
        di = (long) (num1 / num2);
        mo = (long) (num1 % num2);
        
         JOptionPane.showMessageDialog(null, "Su operaciones fueron \nLa suma es : " +su+"\nLa resta da: "+re+"\nLa multiplicacion: "+mu+"\nLa division es: "+di+"\nEl modulo da: "+mo);
    }

}
