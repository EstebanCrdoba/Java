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
public class JavaEjercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre,apellido;
        char inicial; 
        byte edad;
        long numcel;
        
        nombre = JOptionPane.showInputDialog("Ingrese sus nombre :");

        apellido = JOptionPane.showInputDialog("Ingrese sus apellidos :");

        inicial = JOptionPane.showInputDialog("Ingrese la letra inicial de tu nombre :").charAt(0);

        edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese su edad :"));

        numcel = Long.parseLong(JOptionPane.showInputDialog("Ingrese su número de celular :"));

        JOptionPane.showMessageDialog(null, "Su nombre es : " + nombre);
        JOptionPane.showMessageDialog(null, "Su apellidos  es : " + apellido);
        JOptionPane.showMessageDialog(null, "Su primera inicial en el nombre es : " + inicial);
        JOptionPane.showMessageDialog(null, "Su edad  es : " + edad);
        JOptionPane.showMessageDialog(null, "Su numero celular   es : " + numcel);
        
    }
    
}
