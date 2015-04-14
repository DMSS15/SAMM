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
import javax.persistence.ManyToOne;

/**
 *
 * @author María y Salva
 */
@Entity
public class Tecnico extends Usuario{
     private static final long serialVersionUID = 1L;
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String especialidad;
    private Integer despacho;

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Integer getDespacho() {
        return despacho;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "especialidad=" + especialidad + '}';
    }
    
    @ManyToOne
    private JefeServicio jefeservicio;
}
