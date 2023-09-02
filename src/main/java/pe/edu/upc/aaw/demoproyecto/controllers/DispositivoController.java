package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.DispositivoDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IDispositivoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {
    @Autowired
    private IDispositivoService dS;
    @PostMapping
    public void registrar(@RequestBody DispositivoDTO dto){
        ModelMapper m=new ModelMapper();
        Dispositivo d=m.map(dto,Dispositivo.class);
        dS.insert(d);
    }
    @GetMapping
    public List<DispositivoDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DispositivoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DispositivoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DispositivoDTO d=m.map(dS.listId(id),DispositivoDTO.class);
        return d;
    }
    @PostMapping("/buscar")
    public List<DispositivoDTO> buscar(@RequestBody LocalDate fecha){
        return dS.findByDateRegistro(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DispositivoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody DispositivoDTO dto){
        ModelMapper m=new ModelMapper();
        Dispositivo d=m.map(dto,Dispositivo.class);
        dS.insert(d);
    }
}
