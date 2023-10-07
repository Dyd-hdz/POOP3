/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica03;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *Diccionario con 5 palabras usando el Hastable e imprimir los elementos
 * @author Luis Hernández
 */
public class Diccionario {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//para usar el Scanner
        
        //String llave, elemento,valor;
        
        Hashtable<String,String> diccionario= new Hashtable<String,String>();
        
        int x=1;
        
        diccionario.put("Algoritmo", "Conjunto ordenado de operaciones sistemáticas que permite hacer un cñalculo y hallar la solución de un tipo de problema.");
        diccionario.put("Intrínseco","Que es propio o caracteristico de la cosa que expresa por sí misma y no depende de las circunstancias.");
        diccionario.put("Paradigma", "Métodos usados para realizar determinadas tareas o proyectos.");
        diccionario.put("Software", "Conjunto de programas y rutinas que permiten a la computadora realizar determinadas tareas.");
        diccionario.put("Hardware", "Conjunto de elementos físicos o materiales que constituyen una computadora o un sistema informático.");
        /*for (int i=0; i<5; i++) {//entrada de datos, con Scanner
            x=i+1;
            System.out.println("Ingrese la palabra "+x);
            llave=sc.nextLine();
            System.out.println("Ingrese su significado");
            elemento=sc.nextLine();
            diccionario.put(llave, elemento);
        }*/
        System.out.println("Palabras en el diccionario");
        for (String clave : diccionario.keySet()) {//salida de datos
            System.out.println("\t"+x+".   "+clave);
            System.out.println("Significado: "+diccionario.get(clave));
            x++;
        }
    }
}
