package ar.ies6.tpfinal.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Usuario {

    private String dni;
    private String nombre;
    private String apellido;
    private String numeroDeTelefono;
    private String email;
    private boolean activo = true;
   
   
    public Usuario() {
    }

    public Usuario(String dni, String nombre, String apellido, String numeroDeTelefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeTelefono = numeroDeTelefono;
        this.email = email;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

    
    
}
