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
    @Column(name = "descriptionLista_de_Reproduccion",nullable = false,length = 100)
    private String descriptionLista_de_Reproduccion;
    @Column(name = "list_contentsLista_de_Reprodccion",nullable = false,length = 1000)
    private String list_contentsLista_de_Reproduccion;
    @Column(name = "type_list_CategoryLista_de_Reproduccion",nullable = false,length = 1000)
    private String type_list_CategoryLista_de_Reproduccion;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public ListaDeReproduccion() {
    }

    public ListaDeReproduccion(int idLista_de_Reproduccion, String nameLista_de_Reproduccion, String descriptionLista_de_Reproduccion, String list_contentsLista_de_Reproduccion, String type_list_CategoryLista_de_Reproduccion, Usuario usuario) {
        this.idLista_de_Reproduccion = idLista_de_Reproduccion;
        this.nameLista_de_Reproduccion = nameLista_de_Reproduccion;
        this.descriptionLista_de_Reproduccion = descriptionLista_de_Reproduccion;
        this.list_contentsLista_de_Reproduccion = list_contentsLista_de_Reproduccion;
        this.type_list_CategoryLista_de_Reproduccion = type_list_CategoryLista_de_Reproduccion;
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

    public String getDescriptionLista_de_Reproduccion() {
        return descriptionLista_de_Reproduccion;
    }

    public void setDescriptionLista_de_Reproduccion(String descriptionLista_de_Reproduccion) {
        this.descriptionLista_de_Reproduccion = descriptionLista_de_Reproduccion;
    }

    public String getList_contentsLista_de_Reprodccion() {
        return list_contentsLista_de_Reproduccion;
    }

    public void setList_contentsLista_de_Reproduccion(String list_contentsLista_de_Reproduccion) {
        this.list_contentsLista_de_Reproduccion = list_contentsLista_de_Reproduccion;
    }

    public String getType_list_CategoryLista_de_Reproduccion() {
        return type_list_CategoryLista_de_Reproduccion;
    }

    public void setType_list_CategoryLista_de_Reproduccion(String type_list_CategoryLista_de_Reproduccion) {
        this.type_list_CategoryLista_de_Reproduccion = type_list_CategoryLista_de_Reproduccion;
    }

    public String getList_contentsLista_de_Reproduccion() {
        return list_contentsLista_de_Reproduccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
