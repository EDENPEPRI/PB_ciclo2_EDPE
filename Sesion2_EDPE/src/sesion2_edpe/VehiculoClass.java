/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2_edpe;

/**
 *
 * @author Edwin
 */
public class VehiculoClass {
    //Declarar las siguientes variables: marca, placa, modelo, color, cilindraje, disponibilidad.
    String marca_vehiculo = "Ferrari", placa = "EDP136",color = "Rojo";
    int modelo = 2020,cilindraje = 2100;
    boolean disponibilidad = true;
    //Funcion de visibilidad publica que retorna si la marca y modelo del vehiculo se encuentra disponible  
    public boolean disponibilidad_vehiculo(String marca_v, int modelo_v) {
        if(marca_v == "Ferrari" && modelo_v == 2020) {
            disponibilidad = true;
        } else {
            // Mostrar mensaje informativo al usuario que indique la marca y el modelo disponible.
            System.out.println("Solo tenemos disponibles vehiculos con las siguientes caracteristicas: " + marca_vehiculo + " modelo " + modelo);
            disponibilidad = false;
        }
        return disponibilidad; 
    }
}
