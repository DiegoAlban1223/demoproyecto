package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Support;

import java.util.List;

public interface ISupportService {

    public void insert(Support support);
    public List<Support> list();
    public void delete(int idSupport);
    public Support listId(int idSupport);
}
