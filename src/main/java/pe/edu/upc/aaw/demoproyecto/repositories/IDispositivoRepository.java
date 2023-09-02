package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo,Integer>{
    List<Dispositivo> findByDateRegistro(LocalDate dateRegistro);
}
