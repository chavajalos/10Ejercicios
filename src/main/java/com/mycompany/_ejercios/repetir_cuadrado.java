/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._ejercios;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class repetir_cuadrado {
    public static void main(String[] args) {
         //Dato de entrada
        int entrada;//entrada
        //Salida
        int cuadrado;
        Scanner sc = new Scanner(System.in);
 
       do{
        System.out.println("Introduce un numero");
        entrada=sc.nextInt();
        System.out.println("El numero introducido es:" +entrada );
        cuadrado= entrada * entrada;
        System.out.println("El cuadrado es:" +cuadrado);
        }while(entrada>0);
      
      
    }
}
