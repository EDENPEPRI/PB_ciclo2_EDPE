/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariamintic;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Edwin
 */
public class VeterinariaMINTIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lo primero que debo hacer es crear la instancia de la clase 
        MascotaEncapsulatefieldsClass inst_mascota = new MascotaEncapsulatefieldsClass();
        Date fecha_actual = new Date();
        //Obtener la fecha en formato corto y mostrarlo por pantalla 
        DateFormat formato_corto_fecha = new SimpleDateFormat("dd/MM/yyyy");
        Scanner inst_entrada_datos = new Scanner(System.in);
        //Mediante la instacia llamamos los metodos set para asignar valor 
        inst_mascota.setNombre_mascota("Apollo");
        inst_mascota.setRaza("Criollo");
        inst_mascota.setColor("Caramelo");
        inst_mascota.setFecha_nacimiento(formato_corto_fecha.format(fecha_actual)); 
        inst_mascota.setNro_documento_dueño(1069);
        inst_mascota.setHistoria_clinica(true);
        inst_mascota.setVacunas(false);
               
        //Consultamos el valor de ciertas variables mediante la funcion get
        //Debemos acostumbrarnos a usar la menor cantidad de sout posibles es mejor poder anidar o concatenar las variables a imprimir con salto de linea (\n), 
        //esto nos dara un código mas limpio mas corto y efectivo así se optimiza espacio en memoria de maquina.(BPP)

        System.out.println("FORMA 1: ENCAPSULAMIENTO CON GETTER Y SETTER DE VARIABLES.\n\nNombre: " +  inst_mascota.getNombre_mascota()+ "\n Raza: " + inst_mascota.getRaza()+ "\n Color: " + inst_mascota.getColor()+ "\n Fecha de nacimiento: " + inst_mascota.getFecha_nacimiento()+ "\n Numero de documento dueño: " + inst_mascota.getNro_documento_dueño()+ "\n Cuenta con historia clinica: " + inst_mascota.isHistoria_clinica() + "\n Vacunas al dia: " + inst_mascota.isVacunas());
            
               
        //Forma 2 :
        System.out.println("\nFORMA 2: FUNCIONES GETTER Y CONSTRUCTOR DE LA CLASE ");
        // el orden correcto de variables es: String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historia_clinica, int nro_documento_dueño)
        MascotaConstructorGetterClass inst_mascota2 = new MascotaConstructorGetterClass("Antonia",formato_corto_fecha.format(fecha_actual), "Angora",false,true, 1069);
        System.out.println(" \n Nombre: " +  inst_mascota2.getNombre_mascota()+ "\n Fecha de nacimiento: " + inst_mascota2.getFecha_nacimiento()+ "\n Raza: " + inst_mascota2.getRaza() + "\n Vacunas al dia: " + inst_mascota2.isVacunas()  +  "\n Cuenta con historia clinica: " + inst_mascota2.isHistoria_clinica() +  "\n Numero de documento dueño: " + inst_mascota2.getNro_documento_dueño());
    
        
        
        
           //FORMA 3:
       MascotaConstructorEncapsulateFuncionClass inst_mascota3 = new MascotaConstructorEncapsulateFuncionClass("Chandis",formato_corto_fecha.format(fecha_actual),"French puddle",false,true,1069);
       inst_mascota3.consultar_informacion_mascota_metodo();
       
       //Solicitud de informacion al usuario
        System.out.println(">>>>>>>>>>>>>>>>>>>>DILIGENCIA EL SIGUIENTE FORMULARIO<<<<<<<<<<<<<<<<\nNombre:");
        String nombre_dueño = inst_entrada_datos.nextLine();
        System.out.println("Tipo de documento");
        String tipo_documento = inst_entrada_datos.nextLine();
        System.out.println("N° de documento");
        int nro_documento = inst_entrada_datos.nextInt();
        System.out.println("N° de contacto");
        int nro_contacto = inst_entrada_datos.nextInt();
       
       //Instanciamos  la clase del dueño de mascota 
       Dueño_MascotaClass inst_dueño = new Dueño_MascotaClass(nombre_dueño, tipo_documento, nro_documento, nro_contacto, inst_mascota2.getNombre_mascota());
        System.out.println(inst_dueño.consultar_informacion_dueño());
    }
        
     
    
}
