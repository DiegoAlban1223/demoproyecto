package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;
import pe.edu.upc.aaw.demoproyecto.repositories.IPagoRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository pR;

    @Override
    public void insert(Pago pago) {
        pR.save(pago);

    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Pago listId(int id) {
        return pR.findById(id).orElse(new Pago());
    }

    @Override
    public List<Pago> findByFecha_Pago(LocalDate Fecha_Pago) {
        return pR.findByFecha_Pago(Fecha_Pago);
    }
}

