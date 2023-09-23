package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;
import pe.edu.upc.aaw.demoproyecto.repositories.IContenidoRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IContenidoService;
import java.util.List;

@Service
public class ContenidoServiceImplement implements IContenidoService {

    @Autowired
    private IContenidoRepository cR;

    @Override
    public void insert(Contenido contenido) {
        cR.save(contenido);
    }

    @Override
    public List<Contenido> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idContenido) {
        cR.deleteById(idContenido);
    }

    @Override
    public Contenido listId(int idContenido) {
        return cR.findById(idContenido).orElse(new Contenido());
    }
}
