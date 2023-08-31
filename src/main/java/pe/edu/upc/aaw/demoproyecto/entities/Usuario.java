package pe.edu.upc.aaw.demoproyecto.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "Nombre", nullable = false, length = 40)
    private String Nombre;
    @Column(name = "Contraseña", nullable = false, length = 40)
    private String Contraseña;
    @Column(name = "Correo", nullable = false, length = 40)
    private String Correo;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String contraseña, String correo) {
        this.idUsuario = idUsuario;
        Nombre = nombre;
        Contraseña = contraseña;
        Correo = correo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
