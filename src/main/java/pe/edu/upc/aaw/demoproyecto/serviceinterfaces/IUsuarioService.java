package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listid(int idUsuario);
    public List<String[]>UsersRolUser();
    public List<String[]>CantUsers();
}
