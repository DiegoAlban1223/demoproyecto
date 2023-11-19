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


    @Query(value = " SELECT c.title_contenido, count(r.id_resena)\n" +
            " FROM contenido c LEFT JOIN resena r\n" +
            " ON c.id_contenido = r.id_contenido\n" +
            " GROUP BY c.title_contenido", nativeQuery = true)
    public List<String[]> CantidadResenasPorContenido();



    @Query(value = "SELECT c.*\n" +
            "FROM lista_de_reproduccion AS l\n" +
            "INNER JOIN contenido AS c ON l.id_contenido = c.id_contenido\n" +
            "INNER JOIN usuario AS u ON l.id_usuario = u.id_usuario\n" +
            "WHERE u.id_usuario =:idUsuario AND l.name_lista_de_reproduccion = 'favoritos';",nativeQuery = true)

    List<Contenido>peliculasFavoritas(@Param("idUsuario") Integer idUsuario);



}
