package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Resena")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResena;
    @Column(name = "textResena", length = 100, nullable = false)
    private String textResena;
    @Column(name = "dateResena", nullable = false)
    private LocalDate dateResena;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idContenido")
    private Contenido contenido;

    public Resena() {
    }

    public Resena(int idResena, String textResena, LocalDate dateResena, Usuario usuario, Contenido contenido) {
        this.idResena = idResena;
        this.textResena = textResena;
        this.dateResena = dateResena;
        this.usuario = usuario;
        this.contenido = contenido;
    }

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
