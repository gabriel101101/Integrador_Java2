
package models;

import java.io.Serializable;


public class Cliente implements Serializable{
    
    private int idCliente;
    private int cuil;
    private String nombre;
    private String apellido;
    private String razonSocial;

    public Cliente() {}
    
    public Cliente(int idCliente, int cuil, String nombre, String apellido, String razonSocial) {
        this.idCliente = idCliente;
        this.cuil = cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.razonSocial = razonSocial;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
    
    
    
    
    
    
}
