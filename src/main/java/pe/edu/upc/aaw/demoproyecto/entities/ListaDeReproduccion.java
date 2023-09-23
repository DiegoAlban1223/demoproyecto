package pe.edu.upc.aaw.demoproyecto.entities;
import javax.persistence.*;

@Entity
@Table(name = "ListaDeReproduccion")
public class ListaDeReproduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLista_de_Reproduccion;
    @Column(name = "nameLista_de_Reproduccion",nullable = false,length = 45)
    private String nameLista_de_Reproduccion;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public ListaDeReproduccion() {
    }

    public ListaDeReproduccion(int idLista_de_Reproduccion, String nameLista_de_Reproduccion, Usuario usuario) {
        this.idLista_de_Reproduccion = idLista_de_Reproduccion;
        this.nameLista_de_Reproduccion = nameLista_de_Reproduccion;

        this.usuario = usuario;
    }

    public int getIdLista_de_Reproduccion() {
        return idLista_de_Reproduccion;
    }

    public void setIdLista_de_Reproduccion(int idLista_de_Reproduccion) {
        this.idLista_de_Reproduccion = idLista_de_Reproduccion;
    }

    public String getNameLista_de_Reproduccion() {
        return nameLista_de_Reproduccion;
    }

    public void setNameLista_de_Reproduccion(String nameLista_de_Reproduccion) {
        this.nameLista_de_Reproduccion = nameLista_de_Reproduccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
