package pe.edu.upc.aaw.demoproyecto.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column(name = "typeTarjeta", nullable = false)
    private String typeTarjeta;

    @OneToOne
    @JoinColumn(name = "id")
    private Pago pago;

    public Card() {
    }

    public Card(int idCard, String typeTarjeta, Pago pago) {
        this.idCard = idCard;
        this.typeTarjeta = typeTarjeta;
        this.pago = pago;
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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
