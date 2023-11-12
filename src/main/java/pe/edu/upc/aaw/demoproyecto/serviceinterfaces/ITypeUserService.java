package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.TypeUser;

import java.util.List;

public interface ITypeUserService  {

    public void insert(TypeUser typeUser);
    public List<TypeUser>list();
    public void delete(Long idTypeUser);
    public TypeUser listId(Long idTypeUser);
}
