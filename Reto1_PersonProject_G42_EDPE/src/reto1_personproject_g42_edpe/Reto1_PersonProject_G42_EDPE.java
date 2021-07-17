/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_personproject_g42_edpe;

/**
 *
 * @author Edwin
 */
public class Reto1_PersonProject_G42_EDPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        PersonCLass inst_Person = new PersonCLass("Edwin", "Peñuela", "Cedula de ciudadania ", "Union libre", 1069, 3222831, 1986, false, true);
        System.out.println(inst_Person.funcion_consult_info_P());
        inst_Person.metodo_consult_info_P();
    }
    
}
