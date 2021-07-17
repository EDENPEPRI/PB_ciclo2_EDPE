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
public class PersonCLass {
    private String name;
    private String lastname;
    private String Document_type;
    private String civil_status;
    private int ID_number;
    private int Telephone_number;
    private int born_year;
    private boolean current_study;
    private boolean vaccinated;

    public PersonCLass(String name, String lastname, String Document_type, String civil_status, int ID_number, int Telephone_number, int born_year, boolean current_study, boolean vaccinated) {
        this.name = name;
        this.lastname = lastname;
        this.Document_type = Document_type;
        this.civil_status = civil_status;
        this.ID_number = ID_number;
        this.Telephone_number = Telephone_number;
        this.born_year = born_year;
        this.current_study = current_study;
        this.vaccinated = vaccinated;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the Document_type
     */
    public String getDocument_type() {
        return Document_type;
    }

    /**
     * @param Document_type the Document_type to set
     */
    public void setDocument_type(String Document_type) {
        this.Document_type = Document_type;
    }

    /**
     * @return the civil_status
     */
    public String getCivil_status() {
        return civil_status;
    }

    /**
     * @param civil_status the civil_status to set
     */
    public void setCivil_status(String civil_status) {
        this.civil_status = civil_status;
    }

    /**
     * @return the ID_number
     */
    public int getID_number() {
        return ID_number;
    }

    /**
     * @param ID_number the ID_number to set
     */
    public void setID_number(int ID_number) {
        this.ID_number = ID_number;
    }

    /**
     * @return the Telephone_number
     */
    public int getTelephone_number() {
        return Telephone_number;
    }

    /**
     * @param Telephone_number the Telephone_number to set
     */
    public void setTelephone_number(int Telephone_number) {
        this.Telephone_number = Telephone_number;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    /**
     * @return the current_study
     */
    public boolean isCurrent_study() {
        return current_study;
    }

    /**
     * @param current_study the current_study to set
     */
    public void setCurrent_study(boolean current_study) {
        this.current_study = current_study;
    }

    /**
     * @return the vaccinated
     */
    public boolean isVaccinated() {
        return vaccinated;
    }

    /**
     * @param vaccinated the vaccinated to set
     */
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    
    
    public String funcion_consult_info_P(){
        return  "Consulta la informacion del ciudadano\n ******FORMA 1: Funcion******* \n\n La persona llamada " + getName() + getLastname() + " identificada con " + getDocument_type() + " y de estado civil " + getCivil_status() + " corresponde al Id numero " + getID_number() + ", su numerop de contacto es  " + getTelephone_number() + ", nacio en el año  " + getBorn_year() + ", indica que es  " + isCurrent_study() + " que estudie en la actualidad  " + " y demuestra que es "  + isVaccinated() + " que se encuentre vacunado.";
    }
    public void metodo_consult_info_P() {
        System.out.println( "\n\n Consulta la informacion del ciudadano\n ******FORMA 2: Metodo*****  " + getName() + getLastname() + " " + getDocument_type() + " " + getCivil_status() + " " + getID_number() + " " + getTelephone_number() + " " + getBorn_year() + " " + isCurrent_study() + " " + isVaccinated()); 
    }
}
