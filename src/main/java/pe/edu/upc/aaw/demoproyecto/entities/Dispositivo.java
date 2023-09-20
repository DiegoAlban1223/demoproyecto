package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "nameDispositivo",nullable = false,length = 45)
    private String nameDispositivo;
    @Column(name = "typeDispositivo",nullable = false,length = 45)
    private String typeDispositivo;
    @Column(name = "brandDispositivo",nullable = false,length = 45)
    private String brandDispositivo;
    @Column(name = "modelDispositivo",nullable = false,length = 45)
    private String modelDispositivo;
    @Column(name = "dateRegistro",nullable = false)
    private LocalDate dateRegistro;
    @ManyToOne
    @JoinColumn(name = "idMembresia")
    private Membresia membresia;

    public Dispositivo() {
    }

    public Dispositivo(int idDispositivo, String nameDispositivo, String typeDispositivo, String brandDispositivo, String modelDispositivo, LocalDate dateRegistro, Membresia membresia) {
        this.idDispositivo = idDispositivo;
        this.nameDispositivo = nameDispositivo;
        this.typeDispositivo = typeDispositivo;
        this.brandDispositivo = brandDispositivo;
        this.modelDispositivo = modelDispositivo;
        this.dateRegistro = dateRegistro;
        this.membresia = membresia;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNameDispositivo() {
        return nameDispositivo;
    }

    public void setNameDispositivo(String nameDispositivo) {
        this.nameDispositivo = nameDispositivo;
    }

    public String getTypeDispositivo() {
        return typeDispositivo;
    }

    public void setTypeDispositivo(String typeDispositivo) {
        this.typeDispositivo = typeDispositivo;
    }

    public String getBrandDispositivo() {
        return brandDispositivo;
    }

    public void setBrandDispositivo(String brandDispositivo) {
        this.brandDispositivo = brandDispositivo;
    }

    public String getModelDispositivo() {
        return modelDispositivo;
    }

    public void setModelDispositivo(String modelDispositivo) {
        this.modelDispositivo = modelDispositivo;
    }

    public LocalDate getDateRegistro() {
        return dateRegistro;
    }

    public void setDateRegistro(LocalDate dateRegistro) {
        this.dateRegistro = dateRegistro;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
