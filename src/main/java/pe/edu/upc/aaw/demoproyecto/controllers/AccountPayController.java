package pe.edu.upc.aaw.demoproyecto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoproyecto.dtos.AccountPayDTO;
import pe.edu.upc.aaw.demoproyecto.dtos.SupportDTO;
import pe.edu.upc.aaw.demoproyecto.entities.AccountPay;
import pe.edu.upc.aaw.demoproyecto.entities.Support;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IAccountPayService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/accountspays")

public class AccountPayController {

    @Autowired
    private IAccountPayService apS;

    @PostMapping//es para  crear
    public void registrar(@RequestBody AccountPayController dto) {
        ModelMapper m = new ModelMapper();
        AccountPay ap = m.map(dto, AccountPay.class);
        apS.insert(ap);
    }

    @GetMapping//es para retornar
    public List<AccountPayDTO> listar() {
        return apS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AccountPayDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping// es para modificar
    public void modificar(@RequestBody AccountPayDTO dto){
        ModelMapper m=new ModelMapper();
        AccountPay ap=m.map(dto,AccountPay.class);
        apS.insert(ap);
    }
    @DeleteMapping("/{id}")//es para borrar
    public void eliminar(@PathVariable("id") Integer id) {
        apS.delete(id);
    }

    @GetMapping("/{id}")
    public AccountPayDTO listarId(@PathVariable("id") Integer id){
        //usamos el @PathVariable porque se usara una variable
        ModelMapper m=new ModelMapper();
        AccountPayDTO ap=m.map(apS.listId(id),AccountPayDTO.class);
        return ap;
    }
}
