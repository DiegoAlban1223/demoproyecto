package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import javax.persistence.*;

public class MembresiaDTO {

    private int idMembresia;
    private String typeMembresia;
    private String descripMembresia;
    private int priceMembresia;
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
