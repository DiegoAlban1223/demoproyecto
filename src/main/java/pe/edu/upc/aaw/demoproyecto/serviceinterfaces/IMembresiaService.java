package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;

import java.util.List;

public interface IMembresiaService {

    public void insert(Membresia membresia);
    public List<Membresia> list();
    public void delete(int idMembresia);

    public Membresia listId(int idMembresia);
}
