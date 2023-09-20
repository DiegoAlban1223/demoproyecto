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
    private Usuario Usuario;
    @ManyToOne
    @JoinColumn(name = "idContenido")
    private Contenido Contenido;

    public Resena() {
    }

    public Resena(int idResena, String textResena, LocalDate dateResena, pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario, pe.edu.upc.aaw.demoproyecto.entities.Contenido contenido) {
        this.idResena = idResena;
        this.textResena = textResena;
        this.dateResena = dateResena;
        Usuario = usuario;
        Contenido = contenido;
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

    public pe.edu.upc.aaw.demoproyecto.entities.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(pe.edu.upc.aaw.demoproyecto.entities.Usuario usuario) {
        Usuario = usuario;
    }

    public pe.edu.upc.aaw.demoproyecto.entities.Contenido getContenido() {
        return Contenido;
    }

    public void setContenido(pe.edu.upc.aaw.demoproyecto.entities.Contenido contenido) {
        Contenido = contenido;
    }
}
