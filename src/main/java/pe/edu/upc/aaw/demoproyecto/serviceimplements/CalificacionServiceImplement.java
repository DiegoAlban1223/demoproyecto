package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Calificacion;
import pe.edu.upc.aaw.demoproyecto.entities.TypeUser;
import pe.edu.upc.aaw.demoproyecto.repositories.ICalificacionRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICalificacionService;

import java.util.List;

@Service
public class CalificacionServiceImplement implements ICalificacionService {
    @Autowired
    private ICalificacionRepository cR;
    @Override
    public void insert(Calificacion calificacion) {
        cR.save(calificacion);
    }

    @Override
    public List<Calificacion> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCalificacion) {
        cR.deleteById(idCalificacion);
    }

    @Override
    public Calificacion listId(int idCalificacion) {
        return cR.findById(idCalificacion).orElse(new Calificacion());
    }
}
