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
public class igualdad_numerica {
    public static void main(String[] args){
        //Declaracion de variables
        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduzca usted su primer numero ");
        n1=sc.nextInt();
        System.out.println("Por favor introduzca usted su segundo numero ");
        n2=sc.nextInt();
        if(n1==n2){
             System.out.println("Ambos son el mismo numero ");
        }else{
         System.out.println("Son numeros distintos ");
    }
}
}