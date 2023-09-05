package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.CardDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Card;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICardService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cards")

public class CardController {

    @Autowired
    private ICardService cS;

    @PostMapping//es para  crear
    public void registrar(@RequestBody CardDTO dto) {
        ModelMapper m = new ModelMapper();
        Card c = m.map(dto, Card.class);
        cS.insert(c);
    }

    @GetMapping//es para retornar
    public List<CardDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CardDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping// es para modificar
    public void modificar(@RequestBody CardDTO dto){
        ModelMapper m=new ModelMapper();
        Card c=m.map(dto,Card.class);
        cS.insert(c);
    }
    @DeleteMapping("/{id}")//es para borrar
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CardDTO listarId(@PathVariable("id") Integer id){
        //usamos el @PathVariable porque se usara una variable
        ModelMapper m=new ModelMapper();
        CardDTO c=m.map(cS.listId(id),CardDTO.class);
        return c;
    }
}
