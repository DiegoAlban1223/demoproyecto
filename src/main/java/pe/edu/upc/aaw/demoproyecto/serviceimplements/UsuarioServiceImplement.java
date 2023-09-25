package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository dR;

    @Override
    public void insert(Usuario usuario) {
        dR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
    }

    @Override
    public Usuario listid(int idUsuario) {
        return null;
    }

    @Override
    public List<String[]> UsersRolUser() {
        return dR.UsersRolUser();
    }


    @Override
    public List<String[]> CantUsers() {
        return dR.CantUsers();
    }

}
