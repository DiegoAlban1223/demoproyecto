package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;


import java.util.List;

public interface IContenidoService {

    public void insert(Contenido contenido);
    public List<Contenido> list();
    public void delete(int idContenido);
    public Contenido listId(int idContenido);
    List<Contenido> findContenidoByNameList( String nameList);
    public List<String[]> CantidadResenasPorContenido();
}
