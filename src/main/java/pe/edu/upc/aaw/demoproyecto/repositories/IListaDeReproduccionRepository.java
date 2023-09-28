package pe.edu.upc.aaw.demoproyecto.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IListaDeReproduccionRepository extends JpaRepository<ListaDeReproduccion,Integer> {

}
