package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;

import javax.persistence.*;
import java.time.LocalDate;

public class ResenaDTO {

    private int idResena;
    private String textResena;
    private LocalDate dateResena;
    private Usuario usuario;
    private Contenido contenido;

    public int getIdResena() {
        return idResena;
    }

    public void setIdResena(int idResena) {
        this.idResena = idResena;
    }

    public String getTextResena() {
        return textResena;
    }

    public void setTextResena(String textResena) {
        this.textResena = textResena;
    }

    public LocalDate getDateResena() {
        return dateResena;
    }

    public void setDateResena(LocalDate dateResena) {
        this.dateResena = dateResena;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
