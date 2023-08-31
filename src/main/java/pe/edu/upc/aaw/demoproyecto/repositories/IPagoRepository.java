package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {

    List<Pago>findByFecha_Pago(LocalDate Fecha_Pago);
}
