/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java.ejercicios;

import java.util.Scanner;


/**
 *
 * @author EstebanC
 */
public class JavaEjercicios3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long num1,num2,su,re,mu,di,mo;
       
       
       System.out.println("Ingrese un numero:");
        num1 = in.nextLong();
        System.out.println("Ingrese el segundo numero:");
        num2 = in.nextLong();
        
        su = (long)(num1+num2);
        re = (long)(num1-num2);
        mu = (long)(num1*num2);
        di = (long)(num1/num2);
        mo = (long) (num1 % num2);
        
        System.out.println("Las operaciones dieron lo siguente \n la Suma:"+su+"\n la resta:"+re+"\n la multiplicacion: "+mu+"\n la division: "+di+"\n el modulo es: "+mo);
    }
    
}
