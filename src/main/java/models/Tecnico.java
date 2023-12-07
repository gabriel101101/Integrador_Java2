
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tecnico")
public class Tecnico implements Serializable {
    
    @Id
    private int legajo;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    private String especialidad;
     
    public Tecnico(){}
    public Tecnico(String nombre,String apellido,int legajo,String especialidad){
        this.nombre=nombre;
        this.legajo=legajo;
        this.especialidad=especialidad;
        this.apellido=apellido;
    }

    public int getLegajo() {return legajo;}
    public void setLegajo(int legajo) {this.legajo= legajo;}

    public String getEspecialidad() {return especialidad;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
}
