package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.CalificacionDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.PromedioCalificacionesDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Calificacion;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.ICalificacionService;

import java.util.ArrayList;
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
    @GetMapping("/promedioCalificaciones")
    public List<PromedioCalificacionesDTO> promedioCalificaciones(@RequestParam int idcontenido) {
        List<String[]> lista = cS.promedioCalificaciones(idcontenido);

        // Verificación de nulos
        if (lista == null) {
            // Manejar el caso en el que la lista es null
            return new ArrayList<>(); // o lanzar una excepción, según tus necesidades
        }

        List<PromedioCalificacionesDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            // Verificación de nulos para data
            if (data != null && data.length > 0) {
                PromedioCalificacionesDTO dto = new PromedioCalificacionesDTO();
                dto.setPromedio_calificado(data[0]);
                listaDTO.add(dto);
            } else {
                // Manejar el caso en el que data es null o está vacío
                // Puedes imprimir un mensaje de registro o lanzar una excepción, según tus necesidades
            }
        }
        return listaDTO;
    }

}
