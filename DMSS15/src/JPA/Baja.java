/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
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
public class Baja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoBaja;
    private String motivo;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    

    //getters and setters
    
    public Long getCodigoBaja() {
        return codigoBaja;
    }

    public void setCodigoBaja(Long codigoBaja) {
        this.codigoBaja = codigoBaja;
    }
    
     public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

     public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoBaja != null ? codigoBaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Baja)) {
            return false;
        }
        Baja other = (Baja) object;
        if ((this.codigoBaja == null && other.codigoBaja != null) || (this.codigoBaja != null && !this.codigoBaja.equals(other.codigoBaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Baja[ id=" + codigoBaja + " ]";
    }
    //Relacion Muchos a uno entre Baja y Tecnico
    @ManyToOne
    private Baja baja;
}
