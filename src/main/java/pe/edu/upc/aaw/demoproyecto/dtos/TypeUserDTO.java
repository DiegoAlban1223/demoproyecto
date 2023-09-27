package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TypeUserDTO {

    private Long idTypeUser;
    private String typeTypeUser;

    public Long getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(Long idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getTypeTypeUser() {
        return typeTypeUser;
    }

    public void setTypeTypeUser(String typeTypeUser) {
        this.typeTypeUser = typeTypeUser;
    }
}
