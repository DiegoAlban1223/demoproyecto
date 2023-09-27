package pe.edu.upc.aaw.demoproyecto.dtos;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
public class ListaDeReproduccionDTO {

    private int idListadeReproduccion;


    private String nameListadeReproduccion;

    private Usuario usuario;

    public int getIdListadeReproduccion() {
        return idListadeReproduccion;
    }

    public void setIdListadeReproduccion(int idLista_de_Reproduccion) {
        this.idListadeReproduccion = idLista_de_Reproduccion;
    }

    public String getNameListadeReproduccion() {
        return nameListadeReproduccion;
    }

    public void setNameListadeReproduccion(String nameListadeReproduccion) {
        this.nameListadeReproduccion = nameListadeReproduccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
