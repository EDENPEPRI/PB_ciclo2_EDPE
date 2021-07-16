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
public class ConductorClass {

    // Definir las variables nombre, matricula, tipo_pase, multa, numero_documento.
    String nombre_propietario = "";
    int nro_documento = 0;
    char categoria;
    String tipo_infraccion = "";
    boolean multar = false;

    public boolean asignar_multa(int num_documento, String nombre_conductor, String infraccion) {
        nombre_propietario = nombre_conductor;
        nro_documento = num_documento;
        tipo_infraccion = infraccion;
        if (tipo_infraccion != "") {
            System.out.println(nombre_propietario + " Se le impone una multa por la infraccion " + tipo_infraccion);
            multar = true;
        } else {
            System.out.println(nombre_propietario + " Felicitaciones te has salvado de la multa ");
        }
        return multar;
        
    }
    
    public void asignar_multa_m(int num_documento, String nombre_conductor, String infraccion) {
        nombre_propietario = nombre_conductor;
        nro_documento = num_documento;
        tipo_infraccion = infraccion;
        if (tipo_infraccion != "") {
            System.out.println(nombre_propietario + " Se le impone una multa por la infraccion " + tipo_infraccion);
            multar = true;
        } else {
            System.out.println(nombre_propietario + " Felicitaciones te has salvado de la multa ");
        }
    }
}

