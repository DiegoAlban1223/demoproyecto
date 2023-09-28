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
      @Query(value= "SELECT l.name_lista_de_reproduccion,count(c.id_contenido)\n" +
              "FROM lista_de_reproduccion l INNER JOIN contenido c\n" +
              "ON l.id_lista_de_reproduccion=c.id_lista_de_reproduccion\n" +
              "GROUP BY l.name_lista_de_reproduccion",nativeQuery = true)
      public List<String[]> CantidadContenidoPorListaDeReproduccion();
}
