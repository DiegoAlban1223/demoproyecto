package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class SupportDTO {

    private int idSupport;
    private LocalDate dateSupport;
    private String descriptionSupport;
    private Boolean pendienteSupport;

    public Boolean isPendienteSupport() {
        return pendienteSupport;
    }

    public void setPendienteSupport(Boolean pendienteSupport) {
        this.pendienteSupport = pendienteSupport;
    }

    private Usuario usuario;
    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public LocalDate getDateSupport() {
        return dateSupport;
    }

    public void setDateSupport(LocalDate dateSupport) {
        this.dateSupport = dateSupport;
    }

    public String getDescriptionSupport() {
        return descriptionSupport;
    }

    public void setDescriptionSupport(String descriptionSupport) {
        this.descriptionSupport = descriptionSupport;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
