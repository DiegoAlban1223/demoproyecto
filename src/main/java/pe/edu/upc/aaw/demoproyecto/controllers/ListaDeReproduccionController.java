package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.ContenidoPorListaDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.ListaDeReproduccionDTO;
import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IListaDeReproduccionService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ListaDeReproduccion")
public class ListaDeReproduccionController {

    @Autowired
    private IListaDeReproduccionService lS;

    @PostMapping
    public void registrar(@RequestBody ListaDeReproduccionDTO dto) {
        ModelMapper m = new ModelMapper();
        ListaDeReproduccion p = m.map(dto,ListaDeReproduccion.class);
        lS.insert(p);
    }

    @GetMapping
    public List<ListaDeReproduccionDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ListaDeReproduccionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ListaDeReproduccionDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ListaDeReproduccionDTO d = m.map(lS.listId(id), ListaDeReproduccionDTO.class);
        return d;
    }
    @GetMapping("/cantidadcontenido")
    @PreAuthorize("hasAnyAuthority('admin')")
    public List<ContenidoPorListaDTO> cantidadContenidoPorLista(){
        List<String[]>lista=lS.CantidadContenidoPorListaDeReproduccion();
        List<ContenidoPorListaDTO> listaDTO=new ArrayList<>();

        for(String[] data:lista){
            ContenidoPorListaDTO dto=new ContenidoPorListaDTO();
            dto.setNameListaDeReproduccion(data[0]);
            dto.setQuantityContenido(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
