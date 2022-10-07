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
public class mayor_menor {
     public static void main(String[] args){
        //Declaracion de variables
        int n1;
        int n2;
        int n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Este programa sirve para ordenar 3 numeros de mayor a menor ");
        System.out.println("Por favor introduzca su primer numero ");
        n1=sc.nextInt();
        System.out.println("Por favor introduzca su segundo numero ");
        n2=sc.nextInt();
        System.out.println("Por favor introduzca su tercer numero ");
        n3=sc.nextInt();
        if(n1>n2 && n2>n3)
            System.out.println( n1+", "+n2+", "+n3);
        else{
            if(n1>n3 && n3>n2)
                System.out.println(n1+", "+n3+", "+n2);
            else{
               if(n2>n1 && n1>n3)
                   System.out.println(n2+", "+n1+", "+n3);
               else{
                  if(n2>n3 && n3>n1)
                      System.out.println(n2+", "+n3+", "+n1);
                  else{
                      if(n3>n1 && n1>n2)
                         System.out.println(n3+", "+n1+", "+n2);
                      else{
                         if(n3>n2 && n2>n1)
                            System.out.println(n3+", "+n2+", "+n1);
                        }
                      }
                   }
                }
            }
     }
}
