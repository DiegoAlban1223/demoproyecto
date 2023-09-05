package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Reseña")
public class Reseña {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReseña;
    @Column(name = "Texto", length = 100, nullable = false)
    private String Texto;
    @Column(name = "Fecha", nullable = false)
    private LocalDate Fecha;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario Usuario;
    @ManyToOne
    @JoinColumn(name = "idContenido")
    private Contenido Contenido;

    public Reseña() {
    }

    public Reseña(int idReseña, String texto, LocalDate fecha, pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario, Contenido contenido) {
        this.idReseña = idReseña;
        Texto = texto;
        Fecha = fecha;
        Usuario = usuario;
        Contenido = contenido;
    }

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
