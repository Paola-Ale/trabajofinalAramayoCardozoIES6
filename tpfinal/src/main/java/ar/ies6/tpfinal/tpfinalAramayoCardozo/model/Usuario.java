package ar.ies6.tpfinal.tpfinalAramayoCardozo.model;

//import java.time.LocalDate;

public class Usuario {

    private String dni;
    private String nombre;
    private String apellido;
    private String numeroDeTelefono;
    private String direccion;
    private String ubicacion;
   
   
    public Usuario() {
    }


    public Usuario(String dni, String nombre, String apellido, String numeroDeTelefono, String direccion,
            String ubicacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeTelefono = numeroDeTelefono;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
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


    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }


    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    
}
