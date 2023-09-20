package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.ReseñaDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Resena;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IReseñaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reseñas")
public class ReseñaController {
    @Autowired
    private IReseñaService rS;

    @PostMapping
    public void registrar(@RequestBody ReseñaDTO dto) {
        ModelMapper m = new ModelMapper();
        Resena d = m.map(dto, Resena.class);
        rS.insert(d);
    }

    @GetMapping
    public List<ReseñaDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReseñaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Resena dto){
        ModelMapper m=new ModelMapper();
        Resena d=m.map(dto, Resena.class);
        rS.insert(d);
    }
}
