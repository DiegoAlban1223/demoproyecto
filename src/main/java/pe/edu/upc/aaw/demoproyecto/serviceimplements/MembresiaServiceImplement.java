package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.repositories.IMembresiaRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements IMembresiaService {
    @Autowired
    private IMembresiaRepository mR;

    @Override
    public void insert(Membresia membresia) {
        mR.save(membresia);
    }

    @Override
    public List<Membresia> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMembresia) {
        mR.deleteById(idMembresia);
    }

    @Override
    public Membresia listId(int idMembresia) {
        return mR.findById(idMembresia).orElse(new Membresia());
    }
}
