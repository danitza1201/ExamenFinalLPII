package Modelo;

public class Rol {
    private int idrol;
    private String nombre;
    private String estado;

    public Rol() {
    }

 
     
    public Rol(int idrol, String nombre, String estado) {
        this.idrol = idrol;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
}
