/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuario;

/**
 *
 * @author Edwin
 */
public class DatosUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Datosvehiculo instClass = new Datosvehiculo();
        System.out.println(instClass.Informacion_vehiculo());
       instClass.Informacion_vehiculo();
       instClass.Informacion_vehiculo_m();
       
       
     String nombre_estudiante  = "Edwin Peñuela";
     char genero= 'M';
     int edad = 35;
     boolean hombre = true; 
     //Validar si el ususario es mayor o menor de edad
     if(edad > 17){
         System.out.println(nombre_estudiante + " es mayor de edad");
     }else{
         System.out.println(nombre_estudiante + " es menor de edad");
     }
     //VAlidar que es hombre y es mayor de edad 
     if (genero == 'M' && edad > 17){
         System.out.println(nombre_estudiante + " es un hombre mayor de edad");
     }else{
         System.out.println(nombre_estudiante + " no cumple alguna condición");
     }
     //preguntar si es hombre a traves de boolean
     if(hombre == true){
         System.out.println(nombre_estudiante + " es hombre");
     }else{
         System.out.println(nombre_estudiante + " es mujer");
     }
}
