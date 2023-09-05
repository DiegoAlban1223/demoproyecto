package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Reseña;

@Repository
public interface IReseñaRepository extends JpaRepository<Reseña, Integer> {

}
