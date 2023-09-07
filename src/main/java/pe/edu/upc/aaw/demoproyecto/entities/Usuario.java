package pe.edu.upc.aaw.demoproyecto.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUsuario", nullable = false, length = 40)
    private String nameUsuario;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "emailUsuario", nullable = false, length = 40)
    private String emailUsuario;

    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "idTypeUser")
    private TypeUser typeUser;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nameUsuario, String password, String emailUsuario, TypeUser typeUser) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.password = password;
        this.emailUsuario = emailUsuario;
        this.typeUser = typeUser;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
}
