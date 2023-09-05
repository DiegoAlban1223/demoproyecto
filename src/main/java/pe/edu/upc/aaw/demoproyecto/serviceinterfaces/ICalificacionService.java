package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Calificacion;

import java.util.List;

public interface ICalificacionService {
    public void insert (Calificacion calificacion);
    public List<Calificacion> list();
    public void delete (int idCalificacion);
}
