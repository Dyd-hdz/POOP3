/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica03;

/**
 * import java.text.SimpleDateFormat; -> Formato de fechas
 * import java.util.ArrayList; -> Para el uso de la coleccion ArrayList
 * import java.util.Calendar; -> Uso del calendario
 * import java.util.Date; -> Uso de fechas
 * import java.util.Enumeration; -> Uso de la coleccion Enumeration
 * import java.util.Hashtable; -> Uso de la coleccion Hashtable
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Arreglo, Colecciones, uso de librerias Date, Math, SimpleDateFormat.
 * @author Luis Hernández
 */
public class Practica03 {

    public static void main(String[] args) {
        System.out.println("************* arreglos **************");
        int []nums;//forma recomendada
        int[] nums1;
        int [] nums2;
        int nums3[];

        int[] num4 = {1,2,3,4,5};//inicializacion de un arreglo

        System.out.println("************* for **************");
        for (int i = 0; i < num4.length; i+=2) {
            int o = num4[i];
            System.out.println(o);
        }

        System.out.println("************* for-each **************");
        for (int o : num4) {
            System.out.println(o);
        }

        System.out.println("************* concatenar **************");

        String s = new String("Hola Mundo");
        String s1 = "Hola mundo 2";
        System.out.println(s);
        System.out.println(s1);

        String nombre = "Antonio";
        String apellido = "Ayala";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println("************* operador punto **************");

        System.out.println("el numero de elementos en el arreglo es: " + num4.length);
        System.out.println("el numero de elementos en el nombre es: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase());//funcion .toUpperCase() pone en mayusculas las letras
        System.out.println(nombreCompleto);
        
        System.out.println("************* wrappers y autoboxing **************");
        //Integer k = new Integer(50);//una forma de declarar a un entero envoltorio, pero casi no se inicializa asi, por que se puede inicializar como si fuera un primitivo 
        Integer k =50;//mejor forma para inicializar un envoltorio
        Integer l = 22;
        int r = k;
        String s3 = k.toString();//.toString() esta pasando el elemento integer a una cadena String
        System.out.println(s3);
        String s4 = r + "";//otra forma de pasar el dato de entero a cadena
        System.out.println(s4);

        System.out.println("************* Colecciones **************");
        System.out.println("************* arrayList **************");

        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(66);
        miArrayList.add(9);//hasta aqui el arraylist tiene dos elemento [66, 9] con indice 0 y 1 respectivamente
        System.out.println(miArrayList.size());//tamaño del arraylist
        System.out.println(miArrayList.get(1));//obtiene el elemento en la pocicion 1, acuerdate que el indice siempre inicia en 0
        miArrayList.add(0, 20);//aqui se agrega el elemento 20 en el indice 0, al agregarlo en la pocision del 66 recorre el arraylist quedando [20,66,9]
        System.out.println("***");
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("***");
        miArrayList.add(2, 77);//ahora se agrega el 77 en el inidice 2 [20,66,77,9]
        for (Integer e : miArrayList) {
            System.out.println(e);
        }

        System.out.println("************* HashTable **************");
        Hashtable<String,Integer> miTabla = new Hashtable<String,Integer>();//se crea una coleccion hastable
        miTabla.put("uno", 1);//al ingresar datos en el hastable se necesita una llave y el valor
        miTabla.put("Antonio", 557966332);
        miTabla.put("Josefina", 552200569);
        System.out.println("Elementos de tabla: "+ miTabla.size());//devuelve el tamaño de la coleccion

        for (Integer valor : miTabla.values()) {//con el .values() solo se estan tomando en cuanta a los valores del hastable, dejando de lado las llaves
            System.out.println(valor);
        }
        for (String clave : miTabla.keySet()) {//con el .keysSet() solo se toma en cuenta a las llaves
            System.out.println(clave);
        }

        System.out.println("************* Enumeracion **************");//las enumeraciones sirven para leer tanto la llave como el valor del hastable al mismo tiempo
        String llave;
        Integer valor;
        //Hashtable<String,Integer> miTabla = new Hashtable<String,Integer>();
        Enumeration<String> llaves = miTabla.keys();//la enumeracion llamada llaves esta tomando las keys(llaves) de mitabla que es un hastable
        while(llaves.hasMoreElements()){//mientras llaves tenga elementos
            llave = llaves.nextElement();
            valor = miTabla.get(llave);//para obtener el valor se usa el .get(llave) con esto obtendra el valor a la que este asociada la llave
            System.out.println("Llave: "+llave+" Valor: "+valor);
        }

        System.out.println("************* Math **************");//la libreria Math para usar algunas funciones matematicas
        System.out.println(Math.PI);//valor de pi
        System.out.println(Math.abs(-5));//absoluto
        System.out.println(Math.pow(3, 2));//potencia, primero es la base y luego la potencia
        System.out.println(Math.sqrt(9));//raiz cuadrada
        System.out.println(Math.max(80, 7));//para saber que numero es mayor

        System.out.println("************* Date **************");
        Date hoy = new Date();//hoy es una variable de tipo dato y se esta inflando con el new
        System.out.println(hoy);

        System.out.println("************* Calendario **************");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);

        System.out.println("************* Formato de date **************");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");//para dar formato al calendario
        System.out.println(formatoFecha.format(hoy));

        System.out.println("************* Formato de calendar **************");//para dar formato al calendario 

        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";//dia
        fechaActual += (calendarioHoy.get(Calendar.MONTH)+1 + " de ");//mes
        fechaActual += calendarioHoy.get(Calendar.YEAR);//año
        System.out.println(fechaActual);
    }
}
