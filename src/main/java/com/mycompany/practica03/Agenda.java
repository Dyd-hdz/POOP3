/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica03;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
/**
 *Agenda con 5 registros guardando nombre de persona y su cumpleaños usando Hashtable 
 * y calendar e imprimir todos los elementos
 * @author Luis Hernández
 */
public class Agenda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre, fecha;
        
        Hashtable<String,String> agenda=new Hashtable<String,String>();
        //SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
        
        for (int i = 0; i < 5; i++) {//guardado de datos
            System.out.println("Ingrese su nombre");
            nombre=sc.nextLine();
            System.out.println("Ingrese su fecha de nacimiento");
            System.out.println("En formato dd/MM/yyyy");
            fecha=sc.nextLine();
            agenda.put(nombre, fecha);
        }
        
        System.out.println("\tAgenda:");//salida de datos
        for (String clave : agenda.keySet()) {
            System.out.println("Nombre:"+clave);
            System.out.println("Su fecha de nacimiento es: "+agenda.get(clave));
        }
    }
}
