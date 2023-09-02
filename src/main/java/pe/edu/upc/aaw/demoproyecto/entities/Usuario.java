package pe.edu.upc.aaw.demoproyecto.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUsuario", nullable = false, length = 40)
    private String nameUsuario;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "mailUsuario", nullable = false, length = 40)
    private String mailUsuario;

    public Usuario() {
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

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }
}
