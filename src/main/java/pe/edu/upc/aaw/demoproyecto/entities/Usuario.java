package pe.edu.upc.aaw.demoproyecto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String nameUsuario;//puede ser username
    @Column(name = "passwordUsuario", nullable = false, length = 100)
    private String passwordUsuario;// puede ser password
    @Column(name = "emailUsuario", nullable = false, length = 50)
    private String emailUsuario;
    @Column(name = "enabledUsuario",nullable = false)
    private Boolean enabledUsuario;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TypeUser> roles;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nameUsuario, String passwordUsuario, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.passwordUsuario = passwordUsuario;
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
        return passwordUsuario;
    }

    public void setPassword(String password) {
        this.passwordUsuario = password;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEnabled() {
        return enabledUsuario;
    }

    public void setEnabled(Boolean enabled) {
        this.enabledUsuario = enabled;
    }

    public List<TypeUser> getRoles() {
        return roles;
    }

    public void setRoles(List<TypeUser> roles) {
        this.roles = roles;
    }
}
