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
public class JavaEjercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom, gra, cod, mat;
        double n1,n2, n3,su1;
       long m1,m2,m3,su;
       
        nom = JOptionPane.showInputDialog("Escriba el nombre del estudiante completo");
        mat = JOptionPane.showInputDialog("Escriba la materia");
        gra = JOptionPane.showInputDialog("Escriba el grado del estudiante");
        cod = JOptionPane.showInputDialog("Escriba el codigo del estudiante"," Maximo 5");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la primera nota","Rango de 0.0 a 5.0"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la segunda nota","Rango de 0.0 a 5.0"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la tercera nota","Rango de 0.0 a 5.0"));
        su1 = (double)(n1+n2+n3)/3;
        m1 = Math.round(n1);
        m2 = Math.round(n2);
        m3 = Math.round(n3);
       su = (long)(m1+m2+m3)/3;
       JOptionPane.showMessageDialog(null, "El estudiante \n"+nom+"\nDel grado\n"+gra+"\nDe la materia \n"+mat+"\nY codigo \n"+cod+"\nLa nota final es\n"+su1+ "\nY rendondea final\n"+su);
       
    }

}
