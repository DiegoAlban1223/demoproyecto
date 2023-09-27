package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;

import java.time.LocalDate;

public class ResenaDTO {
    private int idResena;
    private String Text;
    private LocalDate Date;
    private Usuario usuario;
    private Contenido contenido;



    public String getText() {
        return Text;
    }

    public void setText(String texto) {Text = texto;}

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate fecha) {
        Date = fecha;
    }

    public int getIdResena() {
        return idResena;
    }
    public void setIdResena(int idResena) {
        this.idResena = idResena;
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
