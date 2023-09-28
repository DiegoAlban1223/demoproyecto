package pe.edu.upc.aaw.demoproyecto.dtos;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import javax.persistence.*;

public class ListaDeReproduccionDTO {
    private int idListaDeReproduccion;
    private String nameListaDeReproduccion;
    private Usuario usuario;

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
