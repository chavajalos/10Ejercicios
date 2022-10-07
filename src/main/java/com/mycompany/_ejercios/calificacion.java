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
public class calificacion {
    public static void main(String[] args){
        //Declaracion de variables
        int calificacion;
        Scanner sc=new Scanner(System.in);
        //Pedir datos al usuario
        System.out.println("Este programa puede decirle su desempeño de acuerdo con su calificacion ");
        System.out.println("Segun sea su calificacion podra ser Insuficiente, Suficiente, Bien o Excelente ");
        System.out.println("A ver joven ponga aqui su calificacion ");
        calificacion=sc.nextInt();
          if(calificacion>=4&&calificacion<=10)
        {
            if(calificacion>=4&&calificacion<=6)
            {
                System.out.println("Insuficiente ");
            }
            if (calificacion>6&&calificacion<8)
            {
                System.out.println("Suficiente ");
            }
            if(calificacion>=8&&calificacion<=9)
            {
                System.out.println("Bien ");
            }
            if(calificacion==10)
            {
                System.out.println("Excelente ");
            }
        }else
        {
            System.out.println("No se pase de lanza joven ");
        }
    }
}
