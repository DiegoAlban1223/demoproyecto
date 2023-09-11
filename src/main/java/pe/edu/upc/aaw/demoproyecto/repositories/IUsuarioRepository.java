package pe.edu.upc.aaw.demoproyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import javax.transaction.Transactional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByNameUsuario(String nameUsuario);

    @Query("select count(u.nameUsuario) from Usuario u where u.nameUsuario =:nameUsuario")
    public int buscarUserName(@Param("nameUsuario") String nombre);


    @Transactional
    @Modifying
    @Query(value = "insert into roles (typeTypeUser, idTypeUser) VALUES (:typeTypeUser, :idTypeUser)", nativeQuery = true)
    public  void insRol(@Param("typeTypeUser") String authority, @Param("idTypeUser") Long idTypeUser);
}
