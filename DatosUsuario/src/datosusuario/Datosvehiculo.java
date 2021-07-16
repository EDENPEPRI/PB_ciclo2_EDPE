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
public class Datosvehiculo {
    public static void main(String[] args) {
        String marca_vehiculo = "Mazda";
        int modelo = 2011;
        String placa = "TIC202";
        boolean  actual_soat = false;
        String color = "Azul";
        //Validar si el usuario tiene actualizado el soat se impone multa 
        if(actual_soat == false){
            int valor_multa = 600000;
            System.out.println( "Al propietario del vehiculo " + color + " de placa " + placa +  " se debe aplicar una multa de " + valor_multa);
        }else{
              System.out.println("El vehiculo de placa " + placa + " tiene la documentacion al dia"); 
    }
    // TODO code application logic here
    //Declaramos una funcion de visibilidad publica 
    //Tipo de dato que va a retoirnar es un String 
    //Nombre de la funcion con (parametros)
    //Estructura: modificador acceso tipo_dato_retorno nombre () {}
    public String Informacion_vehiculo(){
        //declarar variables a nivel local de la funcion
        String placa = "TIC202";
        int modelo = 2021;
        String marca = "MINTIC";
        String mensaje = placa + " " + modelo + " " + marca;
        //retornamos un tipo String
        return mensaje;
                
    }
    
   //Metodo
    // Cuando se trabaja un metodo en java siempre se debe tener la palabra reservada void de vacio
    public void Informacion_vehiculo_m(){ 
        String placa = "TIC202";
        int modelo = 2021;
        String marca = "MINTIC";
        System.out.println(placa + " " + modelo + " " + marca);
       
    }
    
}
