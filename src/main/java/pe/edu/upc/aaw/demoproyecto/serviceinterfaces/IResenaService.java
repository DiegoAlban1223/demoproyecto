package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Resena;

import java.util.List;

public interface IResenaService {
    public void insert(Resena resena);
    public List<Resena> list();
    public void delete(int idResena);
    public Resena listId(int idResena);
}
