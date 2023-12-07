
package models;



public class Incidentes {
    
    private String incidente;
    private int ingreso;
    private int salida;
    private String estado;
    private Cliente idCliente;
    

    public Incidentes() {}

    public Incidentes(Cliente idCliente, String incidente, int ingreso, int salida, String estado) {
        this.incidente = incidente;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.idCliente=idCliente;
        
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
    
}
