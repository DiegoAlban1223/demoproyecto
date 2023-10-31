package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.DispositivoDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.MembresiaDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Dispositivo;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ayala")
public class MembresiaController {
    @Autowired
    private IMembresiaService mS;

    @PostMapping
    public void registrar(@RequestBody MembresiaDTO dto){
        ModelMapper m=new ModelMapper();
        Membresia me=m.map(dto,Membresia.class);
        mS.insert(me);
    }
    @GetMapping
    public List<MembresiaDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        mS.delete(id);
    }
    @GetMapping("/{id}")
    public MembresiaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MembresiaDTO me=m.map(mS.listId(id),MembresiaDTO.class);
        return me;
    }
    @PutMapping("/Juan")
    public void modificar(@RequestBody MembresiaDTO dto){
        ModelMapper m=new ModelMapper();
        Membresia me=m.map(dto,Membresia.class);
        mS.insert(me);
    }

    @GetMapping("/buscar")
    public List<MembresiaDTO>  buscarPorPrecio(@RequestParam Integer precio){
        return mS.findBypriceMembresia(precio).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
}
