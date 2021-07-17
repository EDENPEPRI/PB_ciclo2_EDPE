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
public class MascotaEncapsulatefieldsClass {
   private String nombre_mascota; 
   private String fecha_nacimiento;
   private String raza;
   private String color;
   private boolean vacunas;
   private char sexo;
   private boolean historia_clinica;
   private int nro_documento_dueño;
   //GETTER Y SETTER
   // Get: Es para obtener o consultar el valor de una variable(funcion)
   //Set: es para asignar el valor  o editar el valor de una variable(metodo)
   //Forma 1 - Click secundario> Insert code> Getter y setter 
   // Forma 2 - Click secundario> Refactor> Encapsulate files

    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    /**
     * @return the fecha_nacimiento
     */

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the historia_clinica
     */
    public boolean isHistoria_clinica() {
        return historia_clinica;
    }

    /**
     * @param historia_clinica the historia_clinica to set
     */
    public void setHistoria_clinica(boolean historia_clinica) {
        this.historia_clinica = historia_clinica;
    }

    /**
     * @return the nro_documento_dueño
     */
    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }

    /**
     * @param nro_documento_dueño the nro_documento_dueño to set
     */
    public void setNro_documento_dueño(int nro_documento_dueño) {
        this.nro_documento_dueño = nro_documento_dueño;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the vacunas
     */
    public boolean isVacunas() {
        return vacunas;
    }

    /**
     * @param vacunas the vacunas to set
     */
    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
}
