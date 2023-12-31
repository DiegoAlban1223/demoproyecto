package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;

import java.util.List;
public interface IListaDeReproduccionService {
    public void insert(ListaDeReproduccion lista_de_reproduccion);

    public List<ListaDeReproduccion> list();

    public void delete(int idLista_de_Reproduccion);

    public ListaDeReproduccion listId(int idLista_de_Reproduccion);

    public List<String[]> CantidadContenidoPorListaDeReproduccion();
    public List<ListaDeReproduccion> obtenerListaFavorito( Integer idUsuario, Integer idContenido);

}
