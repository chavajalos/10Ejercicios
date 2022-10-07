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
public class dias_pares_impares {
    public static void main(String[] args){
        //Declaracion de variables
        int n1=1;
        int maximo=30;
        System.out.println("En el caso de los meses de 30 dias, los dias pares son: ");
        while(n1<=30){
            if(n1%2==0){
               System.out.println(n1);
            }
         n1++;
        }
    }
}
