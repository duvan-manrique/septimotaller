/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.navegacioncomponentes.controlador;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author duvan
 */
@Named(value = "principal")
@SessionScoped
public class Principal implements Serializable {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDias() {
        return dias;
    }

    /**
     * Creates a new instance of Principal
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

     private String nombre;
    
    private String apellido;
    
    private String profe;
    
    private String[] idioma;
    
    private String genero;
    
    private String ubicacion;
    
    private int dias;

    public Principal() {
    }

    
    public String irDatos(){
        if(dias>0){
        } else {
            return "principal.xhtml?faces-redirect=true";
        }
        return "datos.xhtml?faces-redirect=true";
    }
    
   
}
