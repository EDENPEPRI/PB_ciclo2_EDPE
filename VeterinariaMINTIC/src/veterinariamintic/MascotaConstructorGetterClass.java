/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariamintic;

/**
 *
 * @author Edwin
 */
public class MascotaConstructorGetterClass {
    //Primero declaramos las variables de forma privada 
    //2- Luego creamos los getter de las variables de la clase click Secun> insert code> getter>selectall>generate.
    //3- Insertarmos el constructor de la clase. click secun> insert code> constructor> selectall> generate.
   private String nombre_mascota; 
   private String fecha_nacimiento;
   private String raza;
   private boolean vacunas;
   private boolean historia_clinica;
   private int nro_documento_dueño;

    public MascotaConstructorGetterClass(String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historia_clinica, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.raza = raza;
        this.vacunas = vacunas;
        this.historia_clinica = historia_clinica;
        this.nro_documento_dueño = nro_documento_dueño;
    }

   
   
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getRaza() {
        return raza;
    }


    public boolean isVacunas() {
        return vacunas;
    }

    
    public boolean isHistoria_clinica() {
        return historia_clinica;
    }

    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }
   
   
}
