package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Reseña;
import pe.edu.upc.aaw.demoproyecto.repositories.IReseñaRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IReseñaService;

import java.util.List;

@Service

public class ReseñaServiceImplement implements IReseñaService {

    @Autowired
    private IReseñaRepository rR;

    @Override
    public void insert(Reseña reseña) {
        rR.save(reseña);
    }

    @Override
    public List<Reseña> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReseña) {
        rR.deleteById(idReseña);
    }
}
