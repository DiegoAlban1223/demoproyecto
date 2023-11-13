package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Calificacion;

import java.util.List;

@Repository
public interface ICalificacionRepository extends JpaRepository <Calificacion,Integer>{
    @Query(value= "SELECT ROUND(AVG(c.score)) FROM Calificacion c " +
            "WHERE c.id_contenido = :idcontenido", nativeQuery = true)
    List<String[]> promedioCalificaciones(@Param("idcontenido") int idcontenido);
}
