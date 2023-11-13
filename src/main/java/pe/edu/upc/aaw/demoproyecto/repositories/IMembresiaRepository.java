package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;

import java.util.List;

@Repository
public interface IMembresiaRepository extends JpaRepository <Membresia,Integer> {

    @Query(value = " SELECT m.* from membresia m where m.price_membresia =:precio ",nativeQuery = true)
    List<Membresia> findBypriceMembresia(@Param("precio") Integer precio);
}
