package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.CardDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.PagoDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.SupportDTO;
import pe.edu.upc.aaw.demoproyecto.entities.*;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICardService;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cards")

public class CardController {

    @Autowired
    private ICardService cS;

    @Autowired
    private IPagoService pS;
    /*
    @PostMapping//es para  crear
    public void registrar(@RequestBody CardDTO dto) {
        ModelMapper m = new ModelMapper();
        Card c = m.map(dto, Card.class);
        cS.insert(c);
    }

     */
    @PostMapping
    public ResponseEntity<String> registrar(@RequestBody CardDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Card c = m.map(dto, Card.class);
        cS.insert(c);
        return ResponseEntity.ok("Registrado Correctamente");
    }
    /*
    @PostMapping//es para  crear
    public ResponseEntity<String> registrar(@RequestBody CardDTO dto) {
        ModelMapper m = new ModelMapper();
        Card c = m.map(dto, Card.class);
        Pago p = (Pago) c.getPago();

        if (p == null || p.getId() == 0 ||!PagoExiste(p.getId())) {
            return ResponseEntity.badRequest().body("No existe pago asociada");
        }

        cS.insert(c);

        return ResponseEntity.ok("Registrado exitosamente");
    }

     */



    private boolean PagoExiste(int id) {
        Pago pago = pS.listId(id);
        return pago!=null && pago.getId() > 0 ;
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
    public ResponseEntity<String> eliminar(@PathVariable("id") Integer id) {
            cS.delete(id);
            return ResponseEntity.ok("Eliminado exitosamente");

    }

    @GetMapping("/{id}")
    public CardDTO listarId(@PathVariable("id") Integer id){
        //usamos el @PathVariable porque se usara una variable
        ModelMapper m=new ModelMapper();
        CardDTO c=m.map(cS.listId(id),CardDTO.class);
        return c;
    }
}
