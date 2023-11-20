package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.time.LocalDate;
import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    public List<Pago> list();

    public boolean delete(int id);

    public Pago listId(int id);

    List<Pago> findPagosAnioActualMayor100Credito();
    List<Pago>findByDatePago(LocalDate datePago);


    List<Object[]> findPagosMenosDe200AnualCreditoConSumaTotal();



}
