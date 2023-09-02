package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "nameDispositivo",nullable = false,length = 45)
    private String nameDispositivo;
    @Column(name = "typeDispositivo",nullable = false,length = 45)
    private String typeDispositivo;
    @Column(name = "brandDispositivo",nullable = false,length = 45)
    private String brandDispositivo;
    @Column(name = "modelDispositivo",nullable = false,length = 45)
    private String modelDispositivo;
    @Column(name = "dateRegistro",nullable = false)
    private LocalDate dateRegistro;
    @Column(name = "account_id",nullable = false)
    private int account_id;

    public Dispositivo() {
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNameDispositivo() {
        return nameDispositivo;
    }

    public void setNameDispositivo(String nameDispositivo) {
        this.nameDispositivo = nameDispositivo;
    }

    public String getTypeDispositivo() {
        return typeDispositivo;
    }

    public void setTypeDispositivo(String typeDispositivo) {
        this.typeDispositivo = typeDispositivo;
    }

    public String getBrandDispositivo() {
        return brandDispositivo;
    }

    public void setBrandDispositivo(String brandDispositivo) {
        this.brandDispositivo = brandDispositivo;
    }

    public String getModelDispositivo() {
        return modelDispositivo;
    }

    public void setModelDispositivo(String modelDispositivo) {
        this.modelDispositivo = modelDispositivo;
    }

    public LocalDate getDateRegistro() {
        return dateRegistro;
    }

    public void setDateRegistro(LocalDate dateRegistro) {
        this.dateRegistro = dateRegistro;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
