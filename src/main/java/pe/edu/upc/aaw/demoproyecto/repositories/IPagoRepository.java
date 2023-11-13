package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {

    @Query(value = "SELECT p.* " +
            "FROM Pago p " +
            "JOIN Card c ON c.id_card = p.id_card " +
            "WHERE EXTRACT(YEAR FROM p.date_pago) = EXTRACT(YEAR FROM CURRENT_DATE) " +
            "AND p.quantity_pago > 100 " +
            "AND c.type_tarjeta = 'Credito'", nativeQuery = true)
    List<Pago> findPagosAnioActualMayor100Credito();

    List<Pago>findByDatePago(LocalDate datePago);
}
