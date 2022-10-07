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
public class positivo_o_negativo {
     public static void main(String[] args){
        //Declaracion de variables
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduzca usted un numero para saber si es positivo o negativo ");
        numero=sc.nextInt();
        if(numero>0){
            System.out.println("Su numero es positivo ");
        }else{
           System.out.println("Su numero no es positivo ");
        }
        if(numero<0){
            System.out.println("Su numero es negativo ");
        }else{
           System.out.println("Su numero no es negativo ");
        }
     }
}
