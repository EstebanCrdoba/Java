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
public class JavaEjerciciosPruebaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int num; 
        int num1, num2;
        num1 = (int) (Math.random() * 100) +1;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if(num2 == num1){
            JOptionPane.showMessageDialog(null, "Que suerte el numero fue : " + num1);
        }else if(num2 <=0){
            JOptionPane.showMessageDialog(null, "Numero invalido");
        }else{
            JOptionPane.showMessageDialog(null, "Mala suerte , mejor para la proxima el numero fue: "+num1);
        }
    }        
}
