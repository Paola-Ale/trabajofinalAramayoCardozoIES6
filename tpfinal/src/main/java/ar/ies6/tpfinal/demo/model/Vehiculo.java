package ar.ies6.tpfinal.demo.model;

import org.springframework.stereotype.Component;



@Component
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY) 
    private String patente;
    @Column
    private String marca;
    private String color;
    private String modelo;
    private boolean estado = true;

    public Vehiculo() {}

    public Vehiculo(String patente, String marca, String color, String modelo, boolean estado) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getPatente() { 
        return patente; }
    public void setPatente(String patente) { 
        this.patente = patente; }

    public String getMarca() { 
        return marca; }
    public void setMarca(String marca) {
         this.marca = marca; }

    public String getColor() {
         return color; }
    public void setColor(String color) {
         this.color = color; }

    public String getModelo() {
         return modelo; }
    public void setModelo(String modelo) {
         this.modelo = modelo; }

    public boolean isEstado() {
         return estado; }
    public void setEstado(boolean estado) { 
        this.estado = estado; }
}


