package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.aaw.demoproyecto.entities.Card;
import pe.edu.upc.aaw.demoproyecto.repositories.ICardRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICardService;

import java.util.List;

public class CardServiceImplement implements ICardService {

    @Autowired
    private ICardRepository cR;


    @Override
    public void insert(Card card) {

    }

    @Override
    public List<Card> list() {
        return null;
    }

    @Override
    public void delete(int idCard) {

    }

    @Override
    public Card listId(int idCard) {
        return null;
    }
}
