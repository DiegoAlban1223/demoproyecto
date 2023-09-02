package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.time.LocalDate;
import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    public List<Pago> list();

    public void delete(int id);

    public Pago listId(int id);

    List<Pago>findByDatePago(LocalDate datePago);


}
