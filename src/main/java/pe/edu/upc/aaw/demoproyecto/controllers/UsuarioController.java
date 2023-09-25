package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.UsuarioDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Usuario;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;
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
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        dS.delete(id);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO d = m.map(dS.listid(id), UsuarioDTO.class);
        return d;
    }
    @PutMapping
    public ResponseEntity<String>modificar(@RequestBody UsuarioDTO dto)
    {
        Optional<Usuario> usuarioExistente = Optional.ofNullable(dS.listid(dto.getIdUsuario()));

        if(usuarioExistente.isPresent())
        {
            ModelMapper m =  new ModelMapper();
            m.map(dto,usuarioExistente.get());
            dS.insert(usuarioExistente.get());

            return ResponseEntity.ok("Usuario modificado correctamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
