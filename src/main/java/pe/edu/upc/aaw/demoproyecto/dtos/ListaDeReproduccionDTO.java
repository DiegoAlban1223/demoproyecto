package pe.edu.upc.aaw.demoproyecto.dtos;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
public class ListaDeReproduccionDTO {
    private int idLista_de_Reproduccion;
    private String nameLista_de_Reproduccion;
    private String descriptionLista_de_Reproduccion;
    private String list_contentsLista_de_Reproduccion;
    private String type_list_CategoryLista_de_Reproduccion;
    private Membresia membresia;

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

    public void setList_contentsLista_de_Reprodccion(String list_contentsLista_de_Reprodccion) {
        this.list_contentsLista_de_Reproduccion = list_contentsLista_de_Reprodccion;
    }

    public String getType_list_CategoryLista_de_Reprodccion() {
        return type_list_CategoryLista_de_Reproduccion;
    }

    public void setType_list_CategoryLista_de_Reprodccion(String type_list_CategoryLista_de_Reprodccion) {
        this.type_list_CategoryLista_de_Reproduccion = type_list_CategoryLista_de_Reprodccion;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
