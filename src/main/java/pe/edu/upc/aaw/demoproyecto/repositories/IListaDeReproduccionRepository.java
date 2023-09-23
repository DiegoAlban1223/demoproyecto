package pe.edu.upc.aaw.demoproyecto.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;

import java.util.List;

public interface IListaDeReproduccionRepository extends JpaRepository<ListaDeReproduccion,Integer> {
    @Query(value = "SELECT l.nameLista_de_Reproduccion,count(c.idContenido)\n" +
            " FROM ListaDeReproduccion l INNER JOIN contenido c \n" +
            " ON l.idLista_de_Reproduccion=c.idLista_de_Reproduccion \n" +
            " GROUP BY c.nameLista_de_Reproduccion;",nativeQuery = true)
    public List<String[]>CantidadContenidoPorListaDeReproduccion();
}
