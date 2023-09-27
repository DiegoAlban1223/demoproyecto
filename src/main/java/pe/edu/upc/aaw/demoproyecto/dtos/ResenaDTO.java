package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;

import java.time.LocalDate;

public class ResenaDTO {
    private int idResena;
    private String Text;
    private LocalDate Date;
    private Usuario Usuario;
    private Contenido Contenido;

    public int getIdReseña() {
        return idResena;
    }

    public void setIdReseña(int idReseña) {
        this.idResena = idReseña;
    }

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

    public pe.edu.upc.aaw.demoproyecto.entities.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario) {
        Usuario = usuario;
    }

    public Contenido getContenido() {
        return Contenido;
    }

    public void setContenido(Contenido contenido) {
        Contenido = contenido;
    }
}
