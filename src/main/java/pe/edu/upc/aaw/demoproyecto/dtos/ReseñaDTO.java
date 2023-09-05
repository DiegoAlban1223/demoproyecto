package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import java.time.LocalDate;

public class ReseñaDTO {
    private int idReseña;
    private String Texto;
    private LocalDate Fecha;
    private Usuario Usuario;
    private Contenido Contenido;

    public int getIdReseña() {
        return idReseña;
    }

    public void setIdReseña(int idReseña) {
        this.idReseña = idReseña;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
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
