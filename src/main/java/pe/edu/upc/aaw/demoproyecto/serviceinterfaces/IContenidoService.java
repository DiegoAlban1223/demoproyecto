package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Contenido;


import java.util.List;

public interface IContenidoService {

    public void insert(Contenido contenido);
    public List<Contenido> list();
    public void delete(int idContenido);

    public Contenido listId(int idContenido);
}
