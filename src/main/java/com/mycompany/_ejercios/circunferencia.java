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
//Pedir el radio de una circunferencia y calcular su longitud.

import java.util.Scanner; 
public class circunferencia {
    public static void main(String[] args){
        //Declaracion de variables
        int r;
        final float pi=3.14159f;
        float longitud=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduzca usted la medida del radio de su circulo");
        r=sc.nextInt();
        //Operaciones
        if(r>0){
          longitud=2*pi*r;
        }else{
          System.out.println("Esa medida de radio no es valida");
        }
        System.out.println("Perfecto, esta es la longitud de su circunferencia "+longitud);
        sc. close();
   
    }
}
