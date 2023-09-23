package pe.edu.upc.aaw.demoproyecto.dtos;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
public class ListaDeReproduccionDTO {
    private int idLista_de_Reproduccion;
    private String nameLista_de_Reproduccion;
    private Usuario usuario;

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
