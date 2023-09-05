package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name ="Membresia")
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;
    @Column(name = "typeMembresia",nullable = false,length = 45)
    private String typeMembresia;
    @Column(name = "descripMembresia",nullable = false,length = 45)
    private String descripMembresia;
    @Column(name = "priceMembresia",nullable = false,length = 45)
    private int priceMembresia;
    @Column(name = "idUsuario",nullable = false)
    private int idUsuario;

    public Membresia() {
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getTypeMembresia() {
        return typeMembresia;
    }

    public void setTypeMembresia(String typeMembresia) {
        this.typeMembresia = typeMembresia;
    }

    public String getDescripMembresia() {
        return descripMembresia;
    }

    public void setDescripMembresia(String descripMembresia) {
        this.descripMembresia = descripMembresia;
    }

    public int getPriceMembresia() {
        return priceMembresia;
    }

    public void setPriceMembresia(int priceMembresia) {
        this.priceMembresia = priceMembresia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}