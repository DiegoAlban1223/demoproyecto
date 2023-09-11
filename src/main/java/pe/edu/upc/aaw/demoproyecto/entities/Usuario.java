package pe.edu.upc.aaw.demoproyecto.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "nameUsuario", nullable = false, length = 100)
    private String nameUsuario;
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Column(name = "emailUsuario", nullable = false, length = 50)
    private String emailUsuario;

    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idTypeUser")
    private List<TypeUser> roles;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nameUsuario, String password, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.password = password;
        this.emailUsuario = emailUsuario;

    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<TypeUser> getRoles() {
        return roles;
    }

    public void setRoles(List<TypeUser> roles) {
        this.roles = roles;
    }
}
