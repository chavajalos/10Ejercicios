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
import javax.swing.JOptionPane;
public class calendario{
    public static void main(String[] args) {
		int Enero = 31, Febrero = 28, Marzo = 31; 
                int Abril = 30, Mayo = 31, Junio = 30;
                int Julio = 31, Agosto = 31, Septiembre = 30;
                int Octubre = 31, Noviembre = 30, Diciembre = 31;
                int dia, mes, anio;
		boolean band = false;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
		anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio: "));
		
		if (anio != 0){
			if (mes <= 12) {
				if ((mes == 1) && (dia == Enero)) {
					band = true;
				} else if ((mes == 2) && (dia <= Febrero)) {
					band = true;
				} else if ((mes == 3) && (dia <= Marzo)) {
					band = true;
				} else if ((mes == 4) && (dia <= Abril)) {
					band = true;
				} else if ((mes == 5) && (dia <= Mayo)) {
					band = true;
				} else if ((mes == 6) && (dia <= Junio)) {
					band = true;
				} else if ((mes == 7) && (dia <= Julio)) {
					band = true;
				} else if ((mes == 8) && (dia <= Agosto)) {
					band = true;
				} else if ((mes == 9) && (dia <= Septiembre)) {
					band = true;
				} else if ((mes == 10) && (dia <= Octubre)) {
					band = true;
				} else if ((mes == 11) && (dia <= Noviembre)) {
					band = true;
				} else if ((mes == 12) && (dia <= Diciembre)) {
					band = true;
				}
				if (band) {
					JOptionPane.showMessageDialog(null, "Fecha completamente correcta");
				} else {
					JOptionPane.showMessageDialog(null, "Error: Dia incorrecto");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error: Mes incorrecto");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error: Anio incorrecto");
		}
	}

}
