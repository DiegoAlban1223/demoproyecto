package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.UsuarioDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService dS;
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario d=m.map(dto,Usuario.class);
        dS.insert(d);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO d=m.map(dS.listid(id),UsuarioDTO.class);
        return d;
    }
}
