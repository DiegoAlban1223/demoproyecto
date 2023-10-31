package pe.edu.upc.aaw.demoproyecto.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column(name = "typeTarjeta", nullable = false)
    private String typeTarjeta;
    @Column(name = "nameTareta", nullable = false)
    private String nameTarjeta;
    @Column(name = "FechaVencimiento", nullable = false)
    private Date FechaVencimiento;
    @Column(name = "CVV", nullable = false)
    private int CVV;


    public Card() {
    }

    public Card(int idCard, String typeTarjeta, String nameTarjeta, Date fechaVencimiento, int CVV) {
        this.idCard = idCard;
        this.typeTarjeta = typeTarjeta;
        this.nameTarjeta = nameTarjeta;
        FechaVencimiento = fechaVencimiento;
        this.CVV = CVV;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getTypeTarjeta() {
        return typeTarjeta;
    }

    public void setTypeTarjeta(String typeTarjeta) {
        this.typeTarjeta = typeTarjeta;
    }

    public String getNameTarjeta() {
        return nameTarjeta;
    }

    public void setNameTarjeta(String nameTarjeta) {
        this.nameTarjeta = nameTarjeta;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
}
