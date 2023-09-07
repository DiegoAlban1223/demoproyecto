package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Reseña;
import pe.edu.upc.aaw.demoproyecto.entities.TypeUser;

import java.util.List;

public interface IReseñaService {
    public void insert(Reseña reseña);
    public List<Reseña> list();
    public void delete(int idReseña);
    public Reseña listId(int idReseña);
}
