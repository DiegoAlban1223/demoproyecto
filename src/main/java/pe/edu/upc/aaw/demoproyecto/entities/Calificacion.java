package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name="Calificaion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name="score", nullable = false)
    private int score;
    @ManyToOne
    @JoinColumn(name = "idContenido")
    private Contenido contenido;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, int score, Contenido contenido, Usuario usuario) {
        this.idCalificacion = idCalificacion;
        this.score = score;
        this.contenido = contenido;
        this.usuario = usuario;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
