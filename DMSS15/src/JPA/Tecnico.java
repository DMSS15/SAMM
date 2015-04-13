/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author María y Salva
 */
@Entity
public class Tecnico extends Usuario{
     private static final long serialVersionUID = 1L;
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String especialidad;

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "especialidad=" + especialidad + '}';
    }
    
    
}
