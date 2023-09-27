package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springdoc.core.converters.PageableOpenAPIConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.Card;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;
import pe.edu.upc.aaw.demoproyecto.repositories.ICardRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICardService;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImplement implements ICardService {

    @Autowired
    private ICardRepository cR;


    @Override
    public void insert(Card card) { cR.save(card); }


    @Override
    public List<Card> list() {  return cR.findAll();}

    @Override
    public void delete(int idCard) {
        cR.deleteById(idCard);
    }

    @Override
    public Card listId(int idCard) {
        return cR.findById(idCard).orElse(new Card());
    }


}
