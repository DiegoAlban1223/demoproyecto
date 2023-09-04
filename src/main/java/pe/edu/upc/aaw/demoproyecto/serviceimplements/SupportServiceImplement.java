package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Support;
import pe.edu.upc.aaw.demoproyecto.repositories.ISupportRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ISupportService;

import java.util.List;

@Service
public class SupportServiceImplement implements ISupportService {

    @Autowired
    private ISupportRepository dR;

    @Override
    public void insert(Support support) {
        dR.save(support);
    }

    @Override
    public List<Support> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idSupport) {
        dR.deleteById(idSupport);
    }

    @Override
    public Support listId(int idSupport) {
        return dR.findById(idSupport).orElse(new Support());
    }
}
