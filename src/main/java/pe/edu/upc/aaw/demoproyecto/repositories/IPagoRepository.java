package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {

    List<Pago>findByDatePago(LocalDate datePago);

    @Query(value = "SELECT p.* " +
            "FROM Pago p " +
            "JOIN Card c ON c.id = p.id " +
            "WHERE EXTRACT(YEAR FROM p.date_pago) = EXTRACT(YEAR FROM CURRENT_DATE) " +
            "AND p.quantity_pago > 100 " +
            "AND c.type_tarjeta = 'Credito'", nativeQuery = true)
    List<Pago> findPagosAnioActualMayor100Credito();

    @Query(value = "SELECT p.*, SUM(p.quantity_pago) AS suma_total " +
            "FROM Pago p " +
            "JOIN Membresia m ON p.id_membresia = m.id_membresia " +
            "JOIN Card c ON c.id = p.id " +
            "WHERE p.quantity_pago < 200 " +
            "AND m.type_membresia = 'Anual' " +
            "AND c.type_tarjeta = 'Credito' " +
            "GROUP BY p.id", nativeQuery = true)
    List<Object[]> findPagosMenosDe200AnualCreditoConSumaTotal();
}
