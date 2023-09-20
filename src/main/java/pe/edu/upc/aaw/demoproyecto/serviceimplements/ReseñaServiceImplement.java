package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Resena;
import pe.edu.upc.aaw.demoproyecto.repositories.IReseñaRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IReseñaService;

import java.util.List;

@Service

public class ReseñaServiceImplement implements IReseñaService {

    @Autowired
    private IReseñaRepository rR;

    @Override
    public void insert(Resena reseña) {
        rR.save(reseña);
    }

    @Override
    public List<Resena> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReseña) {
        rR.deleteById(idReseña);
    }

    @Override
    public Resena listId(int idReseña) {
        return rR.findById(idReseña).orElse(new Resena());
    }
}
