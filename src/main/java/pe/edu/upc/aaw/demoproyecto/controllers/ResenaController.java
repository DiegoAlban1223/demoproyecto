package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.ResenaDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.ResenasdeContenidoDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Resena;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IResenaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resenas")
public class ResenaController {
    @Autowired
    private IResenaService rS;

    @PostMapping
    public void registrar(@RequestBody ResenaDTO dto) {
        ModelMapper m = new ModelMapper();
        Resena d = m.map(dto, Resena.class);
        rS.insert(d);
    }

    @GetMapping
    public List<ResenaDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ResenaDTO.class);
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

    @GetMapping("/resenasdeContenido")
    public List<ResenasdeContenidoDTO> resenasdeContenido(@RequestParam int idcontenido) {
        List<String[]> lista = rS.resenasdeContenido(idcontenido);
        List<ResenasdeContenidoDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            ResenasdeContenidoDTO dto = new ResenasdeContenidoDTO();
            dto.setName_usuario(data[0]);
            dto.setText_resena(data[1]);
            dto.setDateResena(LocalDate.parse(data[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
