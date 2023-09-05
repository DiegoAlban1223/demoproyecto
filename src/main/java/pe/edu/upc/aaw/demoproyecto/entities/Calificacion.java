package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name="Calificaion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name="Puntuacion", nullable = false)
    private int Puntuacion;
    @ManyToOne
    @JoinColumn(name = "idContenido")
    private Contenido Contenido;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario Usuario;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, int puntuacion, Contenido contenido, pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario) {
        this.idCalificacion = idCalificacion;
        Puntuacion = puntuacion;
        Contenido = contenido;
        Usuario = usuario;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }

    public Contenido getContenido() {
        return Contenido;
    }

    public void setContenido(Contenido contenido) {
        Contenido = contenido;
    }

    public pe.edu.upc.aaw.demoproyecto.entities.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario) {
        Usuario = usuario;
    }
}
