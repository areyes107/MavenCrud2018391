package org.angelreyes.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="personas")
public class Persona implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codigoPersona")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoPersona;
    
    @Column
    private String nombres;
    
    @Column 
    private String apellidos;

    public Persona() {
    }

    public Persona(int codigoPersona, String nombres, String apellidos) {
        this.codigoPersona = codigoPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigoPersona=" + codigoPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if (this.codigoPersona != other.codigoPersona) {
            return false;
        }
        return true;
    }
}
