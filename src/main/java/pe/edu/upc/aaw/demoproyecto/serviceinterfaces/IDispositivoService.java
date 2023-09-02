package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;

import java.time.LocalDate;
import java.util.List;

public interface IDispositivoService {
    public void insert(Dispositivo dispositivo);
    public List<Dispositivo> list();
    public void delete(int idDispositivo);

    public Dispositivo listId(int idDispositivo);
    List<Dispositivo> findByDateRegistro(LocalDate dateRegistro);
}
