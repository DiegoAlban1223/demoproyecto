package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;

import java.util.List;

@Repository
public interface IContenidoRepository extends JpaRepository <Contenido,Integer> {

    @Query(value = " SELECT c.*\n" +
            " FROM contenido c\n" +
            " INNER JOIN lista_de_reproduccion l ON c.id_lista_de_reproduccion = l.id_lista_de_reproduccion\n" +
            " WHERE l.name_lista_de_reproduccion =:nameList ",nativeQuery = true)
    List<Contenido> findContenidoByNameList(@Param("nameList") String nameList);
}
