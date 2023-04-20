/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.ejercicios;

import java.util.Scanner;

/**
 *
 * @author EstebanC
 */
public class JavaEjercicios1 {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        String nombre,apellido;
        char inicial; 
        byte edad;
        long numcel;
        
        System.out.println("Ingrese su nombre :");
        nombre = in.nextLine();
        
        System.out.println("Ingrese sus apellidos:");
        apellido = in.nextLine();
        
        System.out.println("Ingrese la 1 letra de su nombre:");
        inicial = in.next().charAt(0);
        
        System.out.println("Ingrese su edad:");
        edad = in.nextByte();
        
        System.out.println("Ingrese su numero de telefono:");
        numcel = in.nextLong();
        
        System.out.println("Su nombre es : "+nombre);
        System.out.println("Su apellido es : "+apellido);
        System.out.println("Su letra inicial es : "+inicial);
        System.out.println("Tu edad es : "+edad);
        System.out.println("Tu numero de celular es : "+numcel);

    }
}
