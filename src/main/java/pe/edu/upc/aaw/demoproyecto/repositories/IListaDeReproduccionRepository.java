package pe.edu.upc.aaw.demoproyecto.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;

import java.util.List;

public interface IListaDeReproduccionRepository extends JpaRepository<ListaDeReproduccion,Integer> {
    @Query(value = "SELECT p.id_contenido from calificaion p where puntuacion < 7", nativeQuery = true)
    public List<String[]> ListFavoriteFilm();
}
