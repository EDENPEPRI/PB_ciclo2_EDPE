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
public class MascotaConstructorEncapsulateFuncionClass {
    //1- Primero declaramos las variables de forma privada 
    //2- Luego encapsulamos las variables de la clase click Secun> refactor>encapsulate fields>selectall>generate.
    //3- Insertarmos el constructor de la clase. click secun> insert code> constructor> selectall> generate.
    //4- Crear metodo que imprime los valores de todos los getter de la clase.
   private String nombre_mascota; 
   private String fecha_nacimiento;
   private String raza;
   private boolean vacunas;
   private boolean historia_clinica;
   private int nro_documento_dueño;

    public MascotaConstructorEncapsulateFuncionClass(String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historia_clinica, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.raza = raza;
        this.vacunas = vacunas;
        this.historia_clinica = historia_clinica;
        this.nro_documento_dueño = nro_documento_dueño;
    }

   
   
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
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

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
   
    public String consultar_informacion_mascota(){
        //Si el valor de vacunas es true o false mostrar mensaje personalizado al usuario.
        String validar_vacunacion;
        if(isVacunas()==true){
            validar_vacunacion = " Vacunas al dia";
        }else{
            validar_vacunacion = " No esta vacunado";
        }
        String historia_clinica;
        if (isHistoria_clinica()== true) {
            historia_clinica = getNombre_mascota()+ " cuenta con historia clinica en Veterinaria MINTIC";
        }else{
            historia_clinica = getNombre_mascota() + " no cuenta con historia clinica en Veterinaria MINTIC";
        }
       
        return "  Nombre:  " + getNombre_mascota() + " \n Raza " + getRaza() + " \n Fecha de nacimiento" + getFecha_nacimiento() + " \nNro de documento dueño: " + getNro_documento_dueño() + "\n"  +  validar_vacunacion + "\n" + historia_clinica;
    }
    
        public void consultar_informacion_mascota_metodo(){
        //Si el valor de vacunas es true o false mostrar mensaje personalizado al usuario.
        String validar_vacunacion;
        if(isVacunas()==true){
            validar_vacunacion = " Vacunas al dia";
        }else{
            validar_vacunacion = " No esta vacunado";
        }
        String historia_clinica;
        if (isHistoria_clinica()== true) {
            historia_clinica = getNombre_mascota()+ " cuenta con historia clinica en Veterinaria MINTIC";
        }else{
            historia_clinica = getNombre_mascota() + " no cuenta con historia clinica en Veterinaria MINTIC";
        }
       
            System.out.println("\n FORMA 3  Nombre:  " + getNombre_mascota() + " \n Raza " + getRaza() + " \n Fecha de nacimiento" + getFecha_nacimiento() + " \n Nro de documento dueño: " + getNro_documento_dueño() + "\n"  +  validar_vacunacion + "\n" + historia_clinica); 
    }
}


