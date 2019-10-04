/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.navegacioncomponentes.controlador;



import java.io.Serializable;
import javax.annotation.PostConstruct;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


/**
 *
 * @author duvan
 */
@Named(value = "datos")
@SessionScoped
public class Datos implements Serializable {
@Inject
 private Principal principal;
    
    
    private String nombre;
    
    private String apellido;
    
    private String profe;
    
    private String[] idioma;
    
    private String genero;
    
    private String ubicacion;
    
    private int dias;
    
    private String sen;
    
    private long tprofecion;
    
    private long tidiomas;
    
    private long tubicacion;
    
    private long tdias;
    
    private long total;
    
    
    
    
       
     @PostConstruct
    public void inicio(){
        
         nombre=principal.getNombre();
         apellido=principal.getApellido();
         profe=principal.getProfe();
         idioma=principal.getIdioma();
         ubicacion=principal.getUbicacion();
         genero=principal.getGenero();
         dias=principal.getDias();
         sen = apodo();
         if(ubicacion.equals("Afueras")){
             tubicacion=80000;
         }
              
    }
    
    public Datos() {
      
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

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

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getSen() {
        return sen;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTprofecion() {
        return tprofecion;
    }

    public void setTprofecion(long tprofecion) {
        this.tprofecion = tprofecion;
    }

    public long getTidiomas() {
        return tidiomas;
    }

    public void setTidiomas(long tidiomas) {
        this.tidiomas = tidiomas;
    }

    public long getTubicacion() {
        return tubicacion;
    }

    public void setTubicacion(long tubicacion) {
        this.tubicacion = tubicacion;
    }

    public long getTdias() {
        return tdias;
    }

    public void setTdias(long tdias) {
        this.tdias = tdias;
    }
    
    public long total(){
        total=tprofecion+tidiomas+tubicacion;
        return total;
    }
    
 public String apodo() {
     String gen = principal.getGenero();;
     
     if(gen.equals("Hombre")){  
         gen="Señor";
    }else {
         gen="Señora ";
     }
        return gen;
    }

    public long profecion() {
        
         switch(profe){
             
             case "ingeniero":
                 tprofecion=dias*200000;
             break;
            case "tecnologo":
                 tprofecion=dias*150000;
             break;
             case "tecnico":
                 tprofecion=dias*100000;
             break;
             default:
                 tprofecion=dias*50000;
             break;
                 
         }
         return tprofecion;
    }

    public long idiomas() {
    for (String idioma1 : idioma) {
        switch (idioma1) {
            case "Ingles":
                tidiomas+=250000;
                break;
            case "Frances":
                tidiomas+=330000;
                break;
            case "Aleman":
                tidiomas+=500000;
                break;
        }
    }
    return tidiomas;
    }

    private boolean validar() {
        if(nombre.equals("")||nombre == null){
            return false;
        }
        if(apellido.equals("")||apellido == null){
            return false;
        }
        if(profe.equals("")||profe == null){
            return false;
        }
        if(ubicacion.equals("")||ubicacion == null){
            return false;
        }
       return  dias > 0;
    }
  
    
}
