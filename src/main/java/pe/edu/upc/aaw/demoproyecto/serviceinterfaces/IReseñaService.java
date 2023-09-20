package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Resena;

import java.util.List;

public interface IReseñaService {
    public void insert(Resena reseña);
    public List<Resena> list();
    public void delete(int idReseña);
    public Resena listId(int idReseña);
}
