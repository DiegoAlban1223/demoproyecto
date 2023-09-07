package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;

import java.time.LocalDate;

public class ReseñaDTO {
    private int idReseña;
    private String Text;
    private LocalDate Date;
    private Usuario Usuario;
    private Contenido Contenido;

    public int getIdReseña() {
        return idReseña;
    }

    public void setIdReseña(int idReseña) {
        this.idReseña = idReseña;
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
