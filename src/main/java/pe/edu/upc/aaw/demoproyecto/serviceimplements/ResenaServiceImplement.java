package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Resena;
import pe.edu.upc.aaw.demoproyecto.repositories.IResenaRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IResenaService;

import java.util.List;

@Service

public class ResenaServiceImplement implements IResenaService {

    @Autowired
    private IResenaRepository rR;

    @Override
    public void insert(Resena reseña) {
        rR.save(reseña);
    }

    @Override
    public List<Resena> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idResena) {
        rR.deleteById(idResena);
    }

    @Override
    public Resena listId(int idResena) {
        return rR.findById(idResena).orElse(new Resena());
    }
}
