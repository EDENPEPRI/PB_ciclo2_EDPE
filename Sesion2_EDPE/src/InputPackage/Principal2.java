/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputPackage;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Principal2 {
    //psvm + tabular para crear el metodo ejecutor
    public static void main(String[] args) {
        // Instanciamos la libreria conductorclass
        ConductorClass inst_conductor = new ConductorClass();
        // Instanciamos la libreria scanner para hacer uso de sus funciones
        System.out.println("Ingresa la informacion del infractor ");
        Scanner entrada_usuario = new Scanner (System.in);
        // Usuario ingresa cadena de texto String 
        System.out.println("NOmbre: ");
        String nombre_conductor = entrada_usuario.nextLine();
        System.out.println(" Tipo de infraccion ");
        String infraccion = entrada_usuario.nextLine();
        // Usuario ingresa numeros 
        System.out.println(" Numero de documento ");
        int nro_documento = entrada_usuario.nextInt();
        inst_conductor.asignar_multa(nro_documento, nombre_conductor, infraccion);
    }
}
