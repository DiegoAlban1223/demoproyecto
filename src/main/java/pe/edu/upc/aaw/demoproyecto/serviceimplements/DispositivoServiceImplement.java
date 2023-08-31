package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;
import pe.edu.upc.aaw.demoproyecto.repositories.IDispositivoRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IDispositivoService;
import java.time.LocalDate;
import java.util.List;

@Service
public class DispositivoServiceImplement implements IDispositivoService{
    @Autowired
    private IDispositivoRepository dR;

    @Override
    public void insert(Dispositivo dispositivo) {
        dR.save(dispositivo);
    }

    @Override
    public List<Dispositivo> list() {

        return dR.findAll();
    }

    @Override
    public void delete(int idDispositivo) {
        dR.deleteById(idDispositivo);
    }

    @Override
    public Dispositivo listId(int idDispositivo) {
        return dR.findById(idDispositivo).orElse(new Dispositivo());
    }

    @Override
    public List<Dispositivo> findByDueDateDispositivo(LocalDate dueDateDispositivo) {
        return dR.findByDueDateDispositivo(dueDateDispositivo);
    }
}
