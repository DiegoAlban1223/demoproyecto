package pe.edu.upc.aaw.demoproyecto.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.SupportDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.TypeUserDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Support;
import pe.edu.upc.aaw.demoproyecto.entities.TypeUser;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ITypeUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeUsers")
public class TypeUserController {

    @Autowired
    private ITypeUserService dS;

    @PostMapping
    public void agregar(@RequestBody TypeUserDTO dto) {

        ModelMapper m = new ModelMapper();
        TypeUser d = m.map(dto, TypeUser.class);
        dS.insert(d);
    }
    @PostMapping("/registerRole")
    public void registrarNuevo(@RequestBody TypeUserDTO dto) {

        ModelMapper m = new ModelMapper();
        TypeUser d = m.map(dto, TypeUser.class);
        dS.insert(d);
    }
    @GetMapping
    public List<TypeUserDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TypeUserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        dS.delete(id);
    }

    @PutMapping// es para modificar
    public void modificar(@RequestBody TypeUser dto){
        ModelMapper m=new ModelMapper();
        TypeUser d=m.map(dto,TypeUser.class);
        dS.insert(d);
    }
}
