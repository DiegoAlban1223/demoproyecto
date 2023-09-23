package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.CantUserDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.UsuarioDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService dS;

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario d = m.map(dto, Usuario.class);
        dS.insert(d);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('user') or hasAuthority('admin')")
    public List<UsuarioDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO d = m.map(dS.listid(id), UsuarioDTO.class);
        return d;
    }
    @PutMapping
    public void modificar(@RequestBody Usuario dto){
        ModelMapper m=new ModelMapper();
        Usuario d=m.map(dto,Usuario.class);
        dS.insert(d);
    }
    @GetMapping("/usuariosroluser")
    @PreAuthorize("hasAuthority('admin')")
    public List<UsuarioDTO> UsuariosRolUser(){
        List<String[]> lista = dS.UsersRolUser();
        List<UsuarioDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            UsuarioDTO dto = new UsuarioDTO();
            dto.setIdUsuario(Long.parseLong(data[0]));
            dto.setEmailUsuario(data[1]);
            dto.setEnabledUsuario(Boolean.parseBoolean(data[2]));
            dto.setNameUsuario(data[3]);
            dto.setPasswordUsuario(data[4]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantusuarios")
    @PreAuthorize("hasAuthority('admin')")
    public List<CantUserDTO> CantidadUsuarios(){
        List<String[]> lista = dS.CantUsers();
        List<CantUserDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            CantUserDTO dto = new CantUserDTO();
            dto.setCant(Long.parseLong(data[0]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
