package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.Card;
import pe.edu.upc.aaw.demoproyecto.entities.Support;

import java.util.List;

public interface ICardService {
    public void insert(Card card);
    public List<Card> list();
    public void delete(int idCard);
    public Card listId(int idCard);


}
