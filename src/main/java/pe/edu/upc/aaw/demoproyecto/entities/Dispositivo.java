package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;
    @Column(name = "tipo",nullable = false,length = 45)
    private String tipo;
    @Column(name = "marca",nullable = false,length = 45)
    private String marca;
    @Column(name = "modelo",nullable = false,length = 45)
    private String modelo;
    @Column(name = "nameDessert",nullable = false)
    private LocalDate fecha_registro;
    @Column(name = "cuenta_id",nullable = false)
    private int cuenta_id;

    public Dispositivo() {
    }

    public Dispositivo(int idDispositivo, String nombre, String tipo, String marca, String modelo, LocalDate fecha_registro, int cuenta_id) {
        this.idDispositivo = idDispositivo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha_registro = fecha_registro;
        this.cuenta_id = cuenta_id;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(int cuenta_id) {
        this.cuenta_id = cuenta_id;
    }
}
