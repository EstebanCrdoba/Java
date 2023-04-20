/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java.ejercicios;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class JavaEjercicios8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner en = new Scanner(System.in);
    long cap = 1000000,deposito,capi;
    byte opc;
        System.out.println("El saldo es de: $"+cap);
        System.out.println("Por favor eliga la opcion \n1-Ingresar dinero\n2-Retirar dinero\n3-Salir");
        opc = en.nextByte();
        switch(opc){
            case 1 -> {
                System.out.println("Ingrese la cantida a depositar");
                deposito = en.nextLong();
                capi = (long)(cap+deposito);
                System.out.println("El saldo es de: $"+capi);
                
            }
            case 2 -> {
                System.out.println("Ingrese la cantida a retitar");
                deposito = en.nextLong();
                capi = (long)(cap-deposito);
                System.out.println("El saldo es de: $"+capi);
            }
            case 3 -> {
                System.out.println("Que tenga buen dia");
            }
            default -> System.out.println("Opcion invalida");
        }
        
    }
    
}
