package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Resena;

import java.util.List;

@Repository
public interface IResenaRepository extends JpaRepository<Resena, Integer> {
    @Query(value = "SELECT u.name_usuario, r.text_resena, r.date_resena" +
            " FROM usuario u" +
            " JOIN resena r ON u.id_usuario = r.id_usuario" +
            " WHERE r.id_contenido = :idcontenido", nativeQuery = true)
    List<String[]> resenasdeContenido(@Param("idcontenido") int idcontenido);



}
