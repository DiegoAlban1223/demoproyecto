package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;
import pe.edu.upc.aaw.demoproyecto.repositories.IListaDeReproduccionRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IListaDeReproduccionService;
import java.util.List;

@Service
public class ListaDeReproduccionServiceImplement implements IListaDeReproduccionService {
    @Autowired
    private IListaDeReproduccionRepository dR;

    @Override
    public void insert(ListaDeReproduccion lista_de_Reproduccion) {
        dR.save(lista_de_Reproduccion);
    }

    @Override
    public List<ListaDeReproduccion> list() {

        return dR.findAll();
    }

    @Override
    public void delete(int idLista_de_Reproduccion) {
        dR.deleteById(idLista_de_Reproduccion);
    }

    @Override
    public ListaDeReproduccion listId(int idLista_de_Reproduccion) {
        return dR.findById(idLista_de_Reproduccion).orElse(new ListaDeReproduccion());
    }
    @Override
    public List<String[]> ListFavoriteFilm(){ return dR.ListFavoriteFilm();}
}
