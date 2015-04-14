/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Juan Carlos Alcaide
 */
@Entity
public class Ciudadano extends Usuario {
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.AUTO)
   private String ocupacion;

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    //Relacion muchos a muchos ciudadano con administrativo
    @ManyToMany
    @JoinTable(name = "ciu_advo",
            joinColumns = @JoinColumn(name = "administrativo_fk"),
            inverseJoinColumns = @JoinColumn(name= "ciudadano_fk"))
    private List<Administrativo> administativoAciudadano;
    
    //Relacion uno a muchos entre ciudadano y demandas
    @OneToMany (mappedBy="ciudadanos")
    private List<Demanda> demandas;
    
    
    private List<Ciudadano> ciudadano;
    @ManyToOne
    private Ciudadano ciud;
}
