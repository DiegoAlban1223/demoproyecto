package pe.edu.upc.aaw.demoproyecto.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.DispositivoDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.PagoDTO;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;
import pe.edu.upc.aaw.demoproyecto.serviceimplements.MembresiaServiceImplement;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IMembresiaService;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private IPagoService pS;

    @Autowired
    private IMembresiaService mS;

    @PostMapping
    public ResponseEntity<String> registrar(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto, Pago.class);
        // Realizar la validación de la membresía aquí
        Membresia membresia = p.getMembresia();
        if (membresia == null || membresia.getIdMembresia() == 0 ||!membresiaExiste(membresia.getIdMembresia())) {
            return ResponseEntity.badRequest().body("No existe membresía asociada");
        }

        pS.insert(p);

        return ResponseEntity.ok("Registrado exitosamente");
    }
    private boolean membresiaExiste(int membresiaId) {
       Membresia membresia = mS.listId(membresiaId);
       return membresia!=null && membresia.getIdMembresia() > 0 ;
    }


    @PostMapping("/buscar")
    public List<PagoDTO> buscar(@RequestBody LocalDate fecha){
        return pS.findByDatePago(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping
    public List<PagoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){pS.delete(id);}

    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO p= m.map(pS.listId(id),PagoDTO.class);
        return p;
    }
    @GetMapping("/pagosanio100")
    public ResponseEntity<List<Pago>> findPagosAnioActualMayor100Credito() {
        List<Pago>pagos = pS.findPagosAnioActualMayor100Credito();
        return ResponseEntity.ok(pagos);
    }

    @GetMapping("/pagostotal")
    public ResponseEntity<List<Pago>> findPagosMenosDe200AnualCreditoConSumaTotal() {
        List<Object[]> resultados = pS.findPagosMenosDe200AnualCreditoConSumaTotal();
        List<Pago> pagos = new ArrayList<>();
        for (Object[] resultado : resultados) {
            Pago pago = (Pago) resultado[0]; // El primer elemento es el objeto Pago
            pagos.add(pago);
        }

        return ResponseEntity.ok(pagos);
    }



}
