package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.CalificacionDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Calificacion;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICalificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calificacion")
public class CalificacionController {
    @Autowired
    private ICalificacionService cS;
    @PostMapping
    public void registrar(@RequestBody CalificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Calificacion d=m.map(dto,Calificacion.class);
        cS.insert(d);
    }

    @GetMapping
    public List<CalificacionDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CalificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Calificacion dto){
        ModelMapper m=new ModelMapper();
        Calificacion d=m.map(dto,Calificacion.class);
        cS.insert(d);
    }
}
