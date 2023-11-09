package pe.edu.upc.aaw.demoproyecto.entities;
import javax.persistence.*;

@Entity
@Table(name = "ListaDeReproduccion")
public class ListaDeReproduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idListaDeReproduccion;
    @Column(name = "nameListaDeReproduccion",length = 45)
    private String nameListaDeReproduccion;

    @ManyToOne
    @JoinColumn(name = "idUsuario",nullable = true)
    private Usuario usuario;

    public ListaDeReproduccion() {
    }

    public ListaDeReproduccion(int idListaDeReproduccion, String nameListaDeReproduccion, Usuario usuario) {
        this.idListaDeReproduccion = idListaDeReproduccion;
        this.nameListaDeReproduccion = nameListaDeReproduccion;
        this.usuario = usuario;
    }

    public int getIdListaDeReproduccion() {
        return idListaDeReproduccion;
    }

    public void setIdListaDeReproduccion(int idListaDeReproduccion) {
        this.idListaDeReproduccion = idListaDeReproduccion;
    }

    public String getNameListaDeReproduccion() {
        return nameListaDeReproduccion;
    }

    public void setNameListaDeReproduccion(String nameListaDeReproduccion) {
        this.nameListaDeReproduccion = nameListaDeReproduccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
