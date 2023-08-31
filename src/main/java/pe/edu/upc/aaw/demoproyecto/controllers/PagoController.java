package pe.edu.upc.aaw.demoproyecto.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.PagoDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private IPagoService pS;

    @PostMapping
    public void registrar(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto,Pago.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PagoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){pS.delete(id);}

    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO p= m.map(pS.listId(id),PagoDTO.class);
        return p;
    }



}
