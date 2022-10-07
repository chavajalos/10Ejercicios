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
public class lectura_numerica {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
 
       do{
        System.out.println("Introduce un numero");
        num=sc.nextInt();
        System.out.println("El numero introducido es:" +num );
        if (num%2==0){
         System.out.println(num+" Es un numero par ");   
        }else{
             System.out.println(num+" Es un numero impar "); 
        }
        }while(num!=0);
      
    }
}

