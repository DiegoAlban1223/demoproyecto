package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name="Calificaion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name="Score", nullable = false)
    private int Score;
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
        Score = score;
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
        return Score;
    }

    public void setScore(int score) {
        Score = score;
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
