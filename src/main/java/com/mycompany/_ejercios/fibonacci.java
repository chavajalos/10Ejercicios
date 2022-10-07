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
public class fibonacci {
   
public static void main(String[] args) {
int num;
int fib1 = 1;
int fib2 = 1;
Scanner lectura = new Scanner(System.in);

System.out.println("Inserte un numero entero");
num = lectura.nextInt();

for (int i = 0 ; i < num; i++){
System.out.println(fib1 +" , " +fib2);
fib1 = fib1 + fib2;
fib2 = fib1 + fib2;
}

}

}
        
    


