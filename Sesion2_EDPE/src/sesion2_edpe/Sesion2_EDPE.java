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
public class Sesion2_EDPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoClass inst_vehiculo = new VehiculoClass();
        ConductorClass inst_conductor = new ConductorClass();
        //Como la funcion recibe dos parametros, los debo inicializar desde aca.
        System.out.println(inst_vehiculo.disponibilidad_vehiculo("Ferrari", 2021));
        System.out.println(inst_conductor.asignar_multa(1053, "Edwin", ""));
        inst_conductor.asignar_multa_m(1053, "Adriana", "Exceso de velocidad");
        System.out.println(inst_conductor.asignar_multa(1053, "Juana", "Exceso de velocidad"));
    }
    
}
