/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Diego
 */
@Entity
public class Reunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoReunion;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String tema;
    private String descripcion;
    @Temporal(TemporalType.TIME)
    private Time horaInicio;
    private Time horaFin;
        
    //getters y setters
    
    public Long getCodigoReunion() {
        return codigoReunion;
    }

    public void setCodigoReunion(Long codigoReunion) {
        this.codigoReunion = codigoReunion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoReunion != null ? codigoReunion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Reunion)) {
            return false;
        }
        Reunion other = (Reunion) object;
        if ((this.codigoReunion == null && other.codigoReunion != null) || (this.codigoReunion != null && !this.codigoReunion.equals(other.codigoReunion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Reunion[ id=" + codigoReunion + " ]";
    }
    
}