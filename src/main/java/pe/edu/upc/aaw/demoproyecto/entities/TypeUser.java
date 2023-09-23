package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "typeUsers", uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id", "typeTypeUser"})})
public class TypeUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypeUser;
    @Column(name = "typeTypeUser",nullable = false,length = 15)
    private String typeTypeUser;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario user;

    public TypeUser() {
    }

    public TypeUser(Long idTypeUser, String typeTypeUser) {
        this.idTypeUser = idTypeUser;
        this.typeTypeUser = typeTypeUser;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

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
