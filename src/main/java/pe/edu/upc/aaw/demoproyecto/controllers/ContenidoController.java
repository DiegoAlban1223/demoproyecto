package pe.edu.upc.aaw.demoproyecto.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.ContenidoDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Contenido;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IContenidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contenidos")
public class ContenidoController {
    @Autowired
    private IContenidoService cS;

    @PostMapping
    public void registrar(@RequestBody ContenidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contenido c = m.map(dto, Contenido.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ContenidoDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ContenidoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ContenidoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ContenidoDTO c = m.map(cS.listId(id), ContenidoDTO.class);
        return c;
    }

    @PutMapping
    public void modificar(@RequestBody ContenidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contenido c = m.map(dto, Contenido.class);
        cS.insert(c);
    }
    @GetMapping("/buscar")
    public List<ContenidoDTO> buscar(@RequestParam String nombreLista) {
        return cS.findContenidoByNameList(nombreLista).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ContenidoDTO.class);
        }).collect(Collectors.toList());
    }
    //localhost:8080/contenidos/buscar?nombreLista=nueva
}
